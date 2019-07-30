package com.emit.complaint_manage.domain;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    // 部门ID
    private int id;
    // 部门名称
    private String name;
    // 部门相关标签
    private String departLabels;
    // 部门投诉总数
    private int comNum;
    // 已处理投诉数量
    private int finishComNum;
    // 未处理投诉数量
    private int freshComNum;

}
