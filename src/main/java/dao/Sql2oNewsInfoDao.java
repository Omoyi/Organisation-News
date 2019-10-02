package dao;

import models.DepartmentInfo;
import models.NewsInfo;
import models.UserInfo;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oNewsInfoDao implements NewsInfoDao {
    private final Sql2o sql2o;

    public Sql2oNewsInfoDao(Sql2o sql2o) { this.sql2o = sql2o; }


    @Override
    public void add(NewsInfo newsInfo) {
        String data="INSERT INTO newsTable(header,contents,deptInfId) VALUES(:header,:contents,:deptInfId)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(data, true)
                    .bind(newsInfo)
                    .executeUpdate()
                    .getKey();
            newsInfo.setId(id);
        } catch (Sql2oException error) {
            System.out.println(error);
        }
    }
//
//    @Override
//    public void addUserInfoToDepartmentInfo(NewsInfo newsInfo, DepartmentInfo departmentInfo) {
//
//    }

    @Override
    public List<NewsInfo> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM newsTable")
                    .executeAndFetch(NewsInfo.class);
        }
    }

    @Override
    public List<NewsInfo> getAllDepartmentsForAUserInfo(int deptInfId) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM newsTable WHERE deptInfId = :deptInfId")
                    .addParameter("deptInfId",deptInfId)
                    .executeAndFetch(NewsInfo.class);
        }
    }

    @Override
    public UserInfo findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        String delete = "DELETE from newsTable WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(delete)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException error) {
            System.out.println(error);
        }
    }

    @Override
    public void clearAll() {
        String delete = "DELETE from newsTable";
        try (Connection con = sql2o.open()) {
            con.createQuery(delete).executeUpdate();
        } catch (Sql2oException error) {
            System.out.println(error);
        }

    }
}
