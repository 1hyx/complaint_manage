package com.emit.complaint_manage.service.impl;

import com.emit.complaint_manage.dao.DepartDao;
import com.emit.complaint_manage.domain.Department;
import com.emit.complaint_manage.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service("departService")
public class DepartServiceImpl implements DepartService {

    @Autowired
    DepartDao departDao;

    /**
     * 查询所有部门信息
     * @return
     */
    @Override
    public List<Department> findAllDepart(){
        return departDao.findAllDepart();
    }
    /**
     * 添加部门
     * @param newDepart
     * @return
     */
    @Override
    public int addDepart(Department newDepart)
    {
        return departDao.addDepart(newDepart);
    }
    /**
     * 删除部门
     * @param name
     */
    @Override
    public int deleteDepartByName(String name) {
        return departDao.deleteDepartmentByName(name);
    }
    /**
     * 更新部门名字
     * @param name
     */
    @Override
    public int editDepartByName(String name, int id) {
        return departDao.editDepartName(name,id);
    }
    /**
     * 更新部门标签
     * @param labels
     */
    @Override
    public void editDepartByLabel(List<String> labels) {

    }

    @Override
    public Department findDepartById(int id) {
        return departDao.findDepartById(id);
    }
}
