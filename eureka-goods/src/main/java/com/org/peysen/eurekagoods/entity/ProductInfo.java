package com.org.peysen.eurekagoods.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 11:27
 */

@Data
@Entity(name = "product_info")
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDesc;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryId;

    private Date createTime;

    private Date updateTime;

}
