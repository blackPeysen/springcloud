package com.org.peysen.eurekaorder.enums;

import lombok.Getter;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:27
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1,"参数错误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message){
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }
}
