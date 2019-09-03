package com.org.peysen.eurekaorder.exception;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:23
 */
public class OrderRunException extends  RuntimeException {

    private Integer code;

    public OrderRunException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
