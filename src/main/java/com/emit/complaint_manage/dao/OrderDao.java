package com.emit.complaint_manage.dao;

import com.emit.complaint_manage.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderDao {
    /**
     * 获取所有工单信息
     */
    List<Order> getAllOrder();

    /**
     * 导入一个新的工单
     * @param newOrder
     * @return
     */
    int addOrder(Order newOrder);

    /**
     * 更新工单状态
     * @param order
     * @return
     */
    int updateOrderState(Order order);

    /**
     * 删除工单
     * @param order
     * @return
     */
    int deleteOrder(Order order);

}
