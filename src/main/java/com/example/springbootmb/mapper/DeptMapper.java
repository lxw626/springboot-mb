package com.example.springbootmb.mapper;

import com.example.springbootmb.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptMapper {

    List<Dept> select(Dept record);

}