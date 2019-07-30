package com.emit.complaint_manage;

import com.emit.complaint_manage.dao.DepartDao;
import com.emit.complaint_manage.domain.Department;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComplaintManageApplicationTests {

    @Autowired
    private DepartDao departDao;

    @Test
    public void addDepartTest(){
        Department department = new Department();
        department.setName("test");
        int total = departDao.addDepart(department);
//        int total = 1;
        Assert.assertEquals(total,1);
    }

    @Test
    public void deleteDepartTest(){
        String name = "dept2";
        int res = departDao.deleteDepartmentByName(name);
        Assert.assertEquals(res,1);
    }

    @Test
    public void contextLoads() {
    }


}
