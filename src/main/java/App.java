import dao.DepartmentInfoDao;
import dao.Sql2oDepartmentInfoDao;
import dao.Sql2oNewsInfoDao;
import dao.Sql2oUserInfoDao;
import models.DepartmentInfo;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        Sql2oUserInfoDao userInfoDao;
        Sql2oDepartmentInfoDao departmentInfoDao;
        Sql2oNewsInfoDao newsInfoDao;
        Connection conn;

        String connectionString = "jdbc:postgresql://localhost:5432/news_portal";
        Sql2o sql2o = new Sql2o(connectionString, "wecode", "1234");

        userInfoDao = new Sql2oUserInfoDao(sql2o);
        newsInfoDao = new Sql2oNewsInfoDao(sql2o);
        departmentInfoDao = new Sql2oDepartmentInfoDao(sql2o);
        conn = sql2o.open();
        System.out.println("hello world");

        get("/home", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        },new HandlebarsTemplateEngine());

        get("/depart/new", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "departform.hbs");
        },new HandlebarsTemplateEngine());

        post("/depart", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int id = Integer.parseInt(request.queryParams("id"));
            String departmentName = request.queryParams("departmentName");
            String description = request.queryParams("description");
            int nbrEmployees = Integer.parseInt(request.queryParams("nbrEmployees"));
            DepartmentInfo departmentInfo = new DepartmentInfo(departmentName, description, nbrEmployees, id);
            DepartmentInfoDao.add(departmentInfo);
            model.put("departments", departmentInfo);
            return new ModelAndView(model, "alldepartment.hbs");
        },new HandlebarsTemplateEngine());
    }
}
