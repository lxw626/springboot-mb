package com.example.springbootmb.mapper;

import com.example.springbootmb.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    List<Emp> select(Emp record);

    int updateByPrimaryKey(Emp record);
    List<String> jobs();
    List<String> deptnos();
}