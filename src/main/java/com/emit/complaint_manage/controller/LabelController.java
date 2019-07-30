package com.emit.complaint_manage.controller;

import com.emit.complaint_manage.service.LabelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("label")
public class LabelController {

    @Resource
    LabelService labelService;

    // todo 修改所有的id为自动生成
    @PostMapping("/add")
    @ResponseBody
    public int addDeptLabel(@RequestParam int labelId,
                            @RequestParam String labelName, HttpSession session){
        // todo label重复性查询
        return labelService.addDeptLabel(labelId,labelName);
    }

}
