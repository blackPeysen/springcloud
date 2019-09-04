package com.org.peysen.eurekaorder.controller;

import com.org.peysen.eurekacommon.feignClient.FeignGoodsClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 13:43
 */

@RestController
@RequestMapping("/feign")
@Slf4j
public class FeignController {

    @Autowired
    private FeignGoodsClient feignGoodsClient;

    @PostMapping("/getDataSource")
    public String getDataSource(){
        log.info("FeignController->getDataSource...");
        return feignGoodsClient.getDataSource();
    }


}
