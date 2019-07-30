package com.emit.complaint_manage.service;

import com.emit.complaint_manage.domain.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartService {

    /**
     *获取全部部门及其标签信息
     * @return List<Department>
     */
    List<Department> findAllDepart();

    /**
     * 增加新部门信息
     * @param newDepart
     */
    int addDepart(Department newDepart);

    /**
     * 删除部门
     * @param name
     */
    int deleteDepartByName(String name);

    /**
     * 修改部门名称
     * @param name,id
     */
    int editDepartByName(String name, int id);

    /**
     * 编辑部门标签
     * @param labels
     */
    void editDepartByLabel(List<String> labels);

    /**
     * 依据id找到部门信息
     * @param id
     * @return
     */
    Department findDepartById(int id);
}
