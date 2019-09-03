package com.org.peysen.eurekaorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 14:23
 */
@Entity
@Data
@Valid
public class OrderMaster {

    @Id
    private String orderId;

    @NotEmpty(message="买家名称不能为空")
    private String buyerName;

    @NotEmpty(message="买家手机号不能为空")
    private String buyerPhone;

    @NotEmpty(message="买家地址不能为空")
    private String buyerAddress;

    private String buyerOpenId;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;


}
