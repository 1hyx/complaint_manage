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

/**
 * @author yuxinhu
 * @date 20190730
 */

@Controller
@RequestMapping("department")
public class DepartController {
    @Resource
    DepartService departService;

    @GetMapping("/all")
    @ResponseBody
    public List<Department> getAllDepart(){
        List<Department> departments = null;
        departments = departService.findAllDepart();
        return departments;
    }

    @PostMapping("/add")
    @ResponseBody
    public int addNewDepartment(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam List<Integer> departLabels,
                                @RequestParam int comNum,
                                @RequestParam int finishComNum,
                                @RequestParam int freshComNum, HttpSession session){
        Department newDepart = new Department();
       // todo 传进来的是名字，要去departLabels表里找id进行存储
        String DepartArray = departLabels.toString();
        newDepart.setName(name);
        newDepart.setId(id);
        newDepart.setDepartLabels(DepartArray);
        newDepart.setComNum(comNum);
        newDepart.setFinishComNum(finishComNum);
        newDepart.setFreshComNum(freshComNum);
        return departService.addDepart(newDepart);
    }

    @PostMapping("/delete")
    @ResponseBody
    public int deleteDepartment(@RequestParam String name, HttpSession session){
        return departService.deleteDepartByName(name);
    }

    @PostMapping("/edit/departName")
    @ResponseBody
    public int editDepartName(@RequestParam String name,
                              @RequestParam int id,  HttpSession session){
        Department preDepart = departService.findDepartById(id);
        String oldName = preDepart.getName();
        // todo 重复性查询
        if(oldName==name){
            return 1;
        }
        else{
            return departService.editDepartByName(name,id);
        }
    }
}
