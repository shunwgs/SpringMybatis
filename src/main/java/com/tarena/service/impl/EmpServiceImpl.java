package com.tarena.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tarena.dao.EmpDao;
import com.tarena.entity.Emp;
import com.tarena.service.EmpService;
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empdao;

    @Override
    public List<Emp> findAll() {
        List<Emp> findAll = empdao.findAll();
        return findAll;
    }
}
