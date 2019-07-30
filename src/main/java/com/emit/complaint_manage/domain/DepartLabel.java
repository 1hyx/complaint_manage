package com.emit.complaint_manage.domain;

import lombok.Data;

@Data
public class DepartLabel {
    // 以ID存储到数据库
    private int labelId;
    // 页面传输前和departLabels表合并后获取名称
    private String labelName;
}
