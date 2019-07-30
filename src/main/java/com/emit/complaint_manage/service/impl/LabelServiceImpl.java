package com.emit.complaint_manage.service.impl;

import com.emit.complaint_manage.dao.LabelDao;
import com.emit.complaint_manage.domain.DepartLabel;
import com.emit.complaint_manage.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("labelService")
public class LabelServiceImpl implements LabelService {

    @Autowired
    LabelDao labelDao;

    @Override
    public int addDeptLabel(int id, String name) {
        return labelDao.addDeptLabel(name,id);
    }

    @Override
    public int editDeptLabel(int id, String name) {
        return 0;
    }

    @Override
    public int deleteDeptLabel(int id) {
        return 0;
    }

    @Override
    public DepartLabel findAllLabels() {
        return null;
    }
}
