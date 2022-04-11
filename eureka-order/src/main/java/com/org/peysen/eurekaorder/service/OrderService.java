package com.org.peysen.eurekaorder.service;

import com.org.peysen.eurekaorder.dto.OrderDTO;
import com.org.peysen.eurekaorder.entity.OrderDetail;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:00
 */
public interface OrderService {

    OrderDetail findOrderDetail(Integer orderId);

    OrderDTO createOrder(OrderDTO orderDTO);

}
