package com.emit.complaint_manage.controller;


import com.emit.complaint_manage.domain.Order;
import com.emit.complaint_manage.service.DepartService;
import com.emit.complaint_manage.service.OrderService;
import com.emit.complaint_manage.service.impl.DepartServiceImpl;
import com.emit.complaint_manage.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    DepartService DepartServices;
    @Autowired
    OrderService orderService;

    @PostMapping("/order/import")
    @ResponseBody
    public int importOrder(@RequestParam String id,
                           @RequestParam String comName,
                           @RequestParam Date comDate,
                           @RequestParam String comTitle,
                           @RequestParam String comDesc,
                           @RequestParam String state,
                           @RequestParam String comType, HttpSession session){
        Order newOrder = new Order();
        newOrder.setId(id);
        newOrder.setComName(comName);
        newOrder.setComDate(comDate);
        newOrder.setComTitle(comTitle);
        newOrder.setComDesc(comDesc);
        newOrder.setComType(comType);
        newOrder.setState(state);
        return orderService.addOrder(newOrder);
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }


}
