package com.emit.complaint_manage.controller;

import com.emit.complaint_manage.domain.Department;
import com.emit.complaint_manage.service.DepartService;
import com.emit.complaint_manage.service.impl.DepartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DepartController {
    @Resource
    DepartService departService;

    @GetMapping("/department")
    @ResponseBody
    public List<Department> getAllDepart(){
        List<Department> departments = null;
        departments = departService.findAllDepart();
        return departments;
    }

    @PostMapping("/add/department")
    @ResponseBody
    public int addNewDepartment(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam int comNum,
                                @RequestParam int finishComNum,
                                @RequestParam int freshComNum, HttpSession session){
        Department newDepart = new Department();
        newDepart.setName(name);
        newDepart.setId(id);
        newDepart.setComNum(comNum);
        newDepart.setFinishComNum(finishComNum);
        newDepart.setFreshComNum(freshComNum);
        return departService.addDepart(newDepart);
    }

    @PostMapping("/delete/department")
    @ResponseBody
    public int deleteDepartment(@RequestParam String name, HttpSession session){
        return departService.deleteDepartByName(name);
    }
}
