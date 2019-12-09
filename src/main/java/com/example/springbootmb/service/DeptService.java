package com.example.springbootmb.service;

import com.example.springbootmb.entity.Dept;
import com.example.springbootmb.entity.Emp;
import com.example.springbootmb.mapper.DeptMapper;
import com.example.springbootmb.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixiewen
 * @create 2019-11-27 15:43
 */
@Service
public class DeptService {
    @Autowired
    DeptMapper deptMapper;

    public List<Dept> getDepts(Dept record){
        return deptMapper.select(record);
    }



}
