package com.org.peysen.eurekagoods.controller;

import com.org.peysen.eurekagoods.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: peimengmeng
 * @Date: 2022/4/10_17:18
 * @Desc:
 */
@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private ProductInfoService productInfoService;


    @PostMapping("/updateStock")
    public String updateStock(Integer productId, int stockNum){
        log.info("updateStock");
        productInfoService.updateStock(productId, stockNum);

        return "Success";
    }

}
