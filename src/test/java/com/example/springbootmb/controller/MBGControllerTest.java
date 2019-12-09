package com.example.springbootmb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lixiewen
 * @create 2019-11-27 16:37
 */
@SpringBootTest
class MBGControllerTest {
    @Autowired
    MBGController mbgController;

//    @Test
//    void genertedByMyBatis() throws Exception {
//        MBG mbg = new MBG();
//        mbg.addTableConfig("emp","Emp").addTableConfig("dept","Dept");
//        mbgController.genertedByMyBatis(mbg);
//    }
}