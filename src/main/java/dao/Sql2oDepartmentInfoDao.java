package dao;

import models.DepartmentInfo;
import models.UserInfo;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oDepartmentInfoDao implements DepartmentInfoDao{

    public Sql2oDepartmentInfoDao(Sql2o sql2o) {

    }

    @Override
    public void add(DepartmentInfo departmentInfo) {

    }

    @Override
    public void addUsersToDepartment(DepartmentInfo departmentInfo, UserInfo userInfo) {

    }

    @Override
    public List<DepartmentInfo> getAll() {
        return null;
    }

    @Override
    public List<UserInfo> getAllUsersInADepartment(int dptInfoId) {
        return null;
    }
}
