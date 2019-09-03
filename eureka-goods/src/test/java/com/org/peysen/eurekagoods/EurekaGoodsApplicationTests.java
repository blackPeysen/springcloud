package com.org.peysen.eurekagoods;

import com.org.peysen.eurekagoods.entity.ProductCategory;
import com.org.peysen.eurekagoods.repository.ProductCatagoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaGoodsApplicationTests {
    @Autowired
    private ProductCatagoryRepository productCatagoryRepository;


    @Test
    public void contextLoads() {
        List<ProductCategory> all = productCatagoryRepository.findAll();
        System.out.println(all.size());
    }

}
