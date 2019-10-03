package dao;

import models.DepartmentInfo;
import models.UserInfo;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oUserInfoDao implements UserInfoDao {
    private final Sql2o sql2o;
    public Sql2oUserInfoDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(UserInfo userInfo) {
        String query ="INSERT INTO userTable(name, post,role) VALUES (:name,:post,:role,)";
        try(Connection connect =sql2o.open()){
            int id= (int) connect.createQuery(query,true)
                    .bind(userInfo)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            userInfo.setId(id);
            System.out.println();
        } catch (Sql2oException excepting){
            System.out.println(excepting);
        }
    }

    @Override
    public void addUsersToDepartment(UserInfo userInfo, DepartmentInfo department) {

    }

    @Override
    public List<UserInfo> all() {
        try(Connection connect=sql2o.open()){
            return connect.createQuery("SELECT * FROM userTable")
                    .throwOnMappingFailure(false)
                    .executeAndFetch(UserInfo.class);
        }
    }

    @Override
    public List<DepartmentInfo> allDepartmentsForUsers(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }

    @Override
    public UserInfo findById(int usersId) {
        return null;
    }
}
