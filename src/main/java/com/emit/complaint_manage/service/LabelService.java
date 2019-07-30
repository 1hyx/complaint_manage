package com.emit.complaint_manage.service;

import com.emit.complaint_manage.domain.DepartLabel;

public interface LabelService {
    int addDeptLabel(int id, String name);
    int editDeptLabel(int id, String name);
    int deleteDeptLabel(int id);// 这个一定要谨慎，因为关于这个标签的部门是否要删除呢？
    DepartLabel findAllLabels();
}
