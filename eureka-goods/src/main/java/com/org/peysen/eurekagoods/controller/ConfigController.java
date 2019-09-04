package com.org.peysen.eurekagoods.controller;

import com.netflix.discovery.converters.Auto;
import com.org.peysen.eurekagoods.config.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 11:04
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @PostMapping("/dataSouce")
    public String dataSource(){
        System.out.println("ConfigController-->dataSource");
        return  dataSourceProperties.toString();
    }

}
