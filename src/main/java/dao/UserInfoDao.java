package dao;

import models.DepartmentInfo;
import models.UserInfo;

import java.util.List;

public interface UserInfoDao {
    void add(UserInfo userInfo);
    void addUsersToDepartment(UserInfo userInfo, DepartmentInfo department);
    List<UserInfo> all();
    List<DepartmentInfo>allDepartmentsForUsers(int id);

    void deleteById(int id);
    void clearAll();

    UserInfo findById(int usersId);
}
