package com.org.peysen.eurekaorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 14:26
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productNum;

    private String productIcon;

}

