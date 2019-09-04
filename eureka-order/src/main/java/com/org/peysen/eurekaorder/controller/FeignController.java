package com.org.peysen.eurekaorder.controller;

import com.org.peysen.eurekaorder.feignService.FeignGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignGoodsService feignGoodsService;

    @PostMapping("/getDataSource")
    public String getDataSource(){
        log.info("FeignController->getDataSource...");
       return feignGoodsService.getDataSource();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        name += "!";
        ServiceInstance instance = client.choose("eureka-goods");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/config/dataSouce";
        String resultStr = restTemplate.postForObject(url, null,String.class);
        return resultStr;
    }

    @GetMapping("/hello1")
    public String hello1() {
        String url = "http://localhost:8763/config/dataSouce";
        String resultStr = restTemplate.postForObject(url, null, String.class);
        return resultStr;
    }

}
