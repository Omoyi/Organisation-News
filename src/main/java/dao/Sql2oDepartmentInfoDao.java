package dao;

import models.DepartmentInfo;
import models.UserInfo;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import org.sql2o.Connection;
import java.util.List;

public class Sql2oDepartmentInfoDao implements DepartmentInfoDao{

    private final Sql2o sql2o;

    public Sql2oDepartmentInfoDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(DepartmentInfo departmentInfo) {
        String data="INSERT INTO departTable(departmentname,description,nbrEmployees) VALUES (:departmentname,:description,:nbrEmployees)";
        try(Connection connect=sql2o.open()){
            int id =(int) connect.createQuery(data,true)
                    .bind(departmentInfo)
                    .executeUpdate()
                    .getKey();
            departmentInfo.setId(id);
        }catch (Sql2oException error){
            System.out.println(error);
        }
    }

    @Override
    public List<DepartmentInfo> getAll() {
        try(Connection connect=sql2o.open()){
            return connect.createQuery("SELECT * FROM departTable")
                    .throwOnMappingFailure(false)
                    .executeAndFetch(DepartmentInfo.class);
        }
    }

    @Override
    public List<UserInfo> getAllUsersInADepartment(int dptInfId) {
      return null;
    }

    @Override
    public DepartmentInfo findById(int id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM departTable WHERE id = :deptInfId")
                    .addParameter("deptInfId", id)
                    .executeAndFetchFirst(DepartmentInfo.class);
        }
    }
}
