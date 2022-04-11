package com.org.peysen.eurekagoods.service;

import com.org.peysen.eurekagoods.entity.ProductInfo;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 11:35
 */
public interface ProductInfoService {

    ProductInfo getProductInfoById(Integer productId);


    void updateStock(Integer productId, int stock);

}
