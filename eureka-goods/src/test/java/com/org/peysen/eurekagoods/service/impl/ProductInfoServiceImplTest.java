package com.org.peysen.eurekagoods.service.impl;

import com.org.peysen.eurekagoods.EurekaGoodsApplicationTests;
import com.org.peysen.eurekagoods.entity.ProductInfo;
import com.org.peysen.eurekagoods.service.ProductInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: peimengmeng
 * @Date: 2022/4/10_16:12
 * @Desc:
 */
public class ProductInfoServiceImplTest extends EurekaGoodsApplicationTests {
    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void getProductInfoById() {
        ProductInfo productInfo = productInfoService.getProductInfoById(1);

        System.out.println(productInfo);
    }
}