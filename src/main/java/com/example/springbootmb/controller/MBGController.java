package com.example.springbootmb.controller;

import com.example.springbootmb.util.mbg.MBGUtil;
import com.example.springbootmb.util.mbg.entity.MBG;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiewen
 * @create 2019-11-27 15:45
 */
@RestController
public class MBGController {
    @GetMapping("/genertedByMyBatis")
    public void genertedByMyBatis(MBG mbg) throws Exception {
        MBGUtil.generate(mbg);
    }
}
