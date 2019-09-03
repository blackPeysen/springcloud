package com.org.peysen.eurekagoods.entity;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Date;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 11:21
 */
@Data
@Entity(name = "product_category")
public class ProductCategory {

    @Id
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
