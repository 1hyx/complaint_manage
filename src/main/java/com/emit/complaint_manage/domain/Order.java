package com.emit.complaint_manage.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    //投诉ID
    private String id;
    // 投诉时间
    private Date comDate;
    // 投诉类型
    private String comType;
    // 投诉人姓名
    private String comName;
    // 投诉描述
    private String comDesc;
    // 投诉标题
    private String comTitle;
    //工单状态
    private String state;
}
