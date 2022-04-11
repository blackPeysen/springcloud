package com.org.peysen.eurekaorder.service.impl;

import com.org.peysen.eurekaorder.dto.OrderDTO;
import com.org.peysen.eurekaorder.entity.OrderDetail;
import com.org.peysen.eurekaorder.repository.OrderDetailRepository;
import com.org.peysen.eurekaorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:06
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail findOrderDetail(Integer orderId) {
        if (isNull(orderId)){
            return null;
        }
        return orderDetailRepository.findById(orderId).orElse(null);
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return null;
    }


}
