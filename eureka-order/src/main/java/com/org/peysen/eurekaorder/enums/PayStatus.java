package com.org.peysen.eurekaorder.enums;

import lombok.Getter;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 14:49
 */
@Getter
public enum PayStatus {
    WAIT(1,"等待支付"),
    SUCCESS(2,"支付完成"),
    ;

    private Integer code;

    private String message;

    PayStatus(Integer code, String message){
        this.code=code;
        this.message=message;
    }



}
