package com.org.peysen.eurekaorder.service.impl;

import com.org.peysen.eurekaorder.EurekaOrderApplicationTests;
import com.org.peysen.eurekaorder.entity.OrderDetail;
import com.org.peysen.eurekaorder.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: peimengmeng
 * @Date: 2022/4/10_16:53
 * @Desc:
 */
public class OrderServiceImplTest extends EurekaOrderApplicationTests {
    @Autowired
    private OrderService orderService;


    @Test
    public void findOrderDetail() {
        OrderDetail orderDetail = orderService.findOrderDetail(1);

        System.out.println(orderDetail);
    }
}