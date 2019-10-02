package dao;

import models.DepartmentInfo;
import models.UserInfo;

import java.util.List;

public interface DepartmentInfoDao {
    void add(DepartmentInfo departmentInfo);
    List<DepartmentInfo>getAll();
    List<UserInfo> getAllUsersInADepartment(int dptInfoId);
    DepartmentInfo findById(int deptInfId);
}
