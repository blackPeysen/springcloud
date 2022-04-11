package com.org.peysen.eurekaorder.repository;

import com.org.peysen.eurekaorder.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 14:44
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
