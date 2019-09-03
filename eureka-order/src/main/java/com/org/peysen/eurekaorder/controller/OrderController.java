package com.org.peysen.eurekaorder.controller;

import com.org.peysen.eurekaorder.dto.OrderDTO;
import com.org.peysen.eurekaorder.enums.ResultEnum;
import com.org.peysen.eurekaorder.exception.OrderRunException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:00
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @PostMapping("/create")
    public void create(@Valid OrderDTO orderDTO, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
           throw new OrderRunException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
    }

}
