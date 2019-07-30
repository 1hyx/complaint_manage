package com.emit.complaint_manage.service.impl;

import com.emit.complaint_manage.controller.OrderController;
import com.emit.complaint_manage.dao.OrderDao;
import com.emit.complaint_manage.domain.Order;
import com.emit.complaint_manage.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int addOrder(Order newOrder) {
        return orderDao.addOrder(newOrder);
    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> orders = orderDao.getAllOrder();
        return orders;
    }

    @Override
    public int changeOrderState(Order order) {
        return orderDao.updateOrderState(order);
    }

    @Override
    public int deleteOrder(Order order) {
        return orderDao.deleteOrder(order);
    }
}
