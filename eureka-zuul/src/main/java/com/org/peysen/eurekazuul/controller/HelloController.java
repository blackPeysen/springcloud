package com.org.peysen.eurekazuul.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/5 17:02
 */

@RestController
public class HelloController {

    @PostMapping("/helloZuul")
    public String helloZuul(){
        return "hello--zuul";
    }
}
