package com.emit.complaint_manage.dao;

import com.emit.complaint_manage.domain.DepartLabel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LabelDao {
    DepartLabel findAllLabels();
    int addDeptLabel(String name,int id);
    int deleteDeptLabel(int id);
    int editDeptLabel(int id, String newName);
}
