package dao;

import models.DepartmentInfo;
import models.NewsInfo;
import models.UserInfo;

import java.util.List;

public interface NewsInfoDao {
    void add(NewsInfo newsInfo);
//    void addUserInfoToDepartmentInfo(NewsInfo newsInfo, DepartmentInfo departmentInfo);
    List<NewsInfo> getAll();
    List<NewsInfo> getAllDepartmentsForAUserInfo(int deptInfId);
    UserInfo findById(int id);
    void deleteById(int id);
    void clearAll();
}
