package com.emit.complaint_manage.service;

import com.emit.complaint_manage.controller.OrderController;
import com.emit.complaint_manage.domain.Order;

import java.util.List;

public interface OrderService {
    /**
     * 工单导入
     * @param newOrder
     */
    int addOrder(Order newOrder);

    /**
     * 获取全部工单
     * @return List<Order>
     */
    List<Order> getAllOrder();

    /**
     * 修改工单处理状态，未处理、处理中、处理结束等
     * @param order
     * @return
     */
    int changeOrderState(Order order);

    /**
     * 按id删除工单记录
     * @param order
     * @return
     */
    int deleteOrder(Order order);
}
