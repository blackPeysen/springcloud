package com.org.peysen.eurekaorder.enums;

import lombok.Getter;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 14:49
 */
@Getter
public enum OrderStatus {
    NEW(1,"新下单"),
    FINISH(2,"订单完成"),
    CANCEL(3,"订单取消"),
    ;

    private Integer code;

    private String message;

    OrderStatus(Integer code, String message){
        this.code=code;
        this.message=message;
    }



}
