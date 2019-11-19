package com.org.peysen.eurekagoods.controller;

import com.netflix.discovery.converters.Auto;
import com.org.peysen.eurekacommon.feignClient.FeignOrderClient;
import com.org.peysen.eurekagoods.config.DataSourceProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 11:04
 */

@Slf4j
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private FeignOrderClient feignOrderClient;

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @PostMapping("/dataSource")
    public String dataSource(){
        log.info("ConfigController-->dataSource");
        return  dataSourceProperties.toString();
    }

    @PostMapping("/feignTest")
    public String feignTest(){
        log.info("ConfigController-->feignTest");
        return  feignOrderClient.feignTest();
    }

}
