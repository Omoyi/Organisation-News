package dao;

import models.DepartmentInfo;
import models.UserInfo;

import java.util.List;

public interface DepartmentInfoDao {
    void add(DepartmentInfo departmentInfo);
    void addUsersToDepartment(DepartmentInfo departmentInfo, UserInfo userInfo);
    List<DepartmentInfo> getAll();
    List<UserInfo> getAllUsersInADepartment(int dptInfoId);

}
