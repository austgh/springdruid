package com.ahzx.service.impl;

import com.ahzx.dao.EmpMapper;
import com.ahzx.entity.Emp;
import com.ahzx.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OUKELE
 * @create 2019-03-22 9:02
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> list() {
        return empMapper.selectAll();
    }
}
