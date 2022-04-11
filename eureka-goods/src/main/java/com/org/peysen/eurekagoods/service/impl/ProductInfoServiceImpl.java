package com.org.peysen.eurekagoods.service.impl;

import com.org.peysen.eurekagoods.entity.ProductInfo;
import com.org.peysen.eurekagoods.repository.ProductInfoRepository;
import com.org.peysen.eurekagoods.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 11:36
 */
@Service("ProductInfoService")
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo getProductInfoById(Integer productId) {
        if (Objects.isNull(productId)){
            return null;
        }


        return productInfoRepository.findById(productId).orElse(null);
    }


    @Override
    @Transactional
    public void updateStock(Integer productId, int stock) {
        ProductInfo productInfo = getProductInfoById(productId);
        if (Objects.isNull(productInfo)){
            return;
        }
        Integer productStock = productInfo.getProductStock();
        productInfo.setProductStock(productStock - stock);

        productInfoRepository.saveAndFlush(productInfo);
    }
}
