package com.emit.complaint_manage.dao;

import com.emit.complaint_manage.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Mapper
@Repository
public interface DepartDao {
    /**
     * 新增一个部门
     * @param newDepart
     * @return
     */
    int addDepart(Department newDepart);

    /**
     * 查询所有的部门
     * @return
     */
    List<Department> findAllDepart();

    /**
     * 修改部门名
     * @param name
     * @return
     */
    int editDepartName(String name);

    /**
     * 修改部门标签
     * @param newLabels
     * @return
     */
    int editDepartLabels(List<String> newLabels);

    /**
     * 用名字删除部门信息
     * @param name
     * @return 删除的数量
     */
    int deleteDepartmentByName(String name);
}
