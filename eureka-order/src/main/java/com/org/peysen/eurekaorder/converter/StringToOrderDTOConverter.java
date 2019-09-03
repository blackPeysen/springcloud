package com.org.peysen.eurekaorder.converter;

import com.alibaba.fastjson.JSON;
import com.org.peysen.eurekaorder.dto.OrderDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @Description: 自定义数据类型转换器：String--》OrderDTO
 * Created by mengmeng.Pei
 * 2019/8/8 9:33
 */
@Component
public class StringToOrderDTOConverter implements Converter<String, OrderDTO> {

    @Override
    public OrderDTO convert(String json) {
        System.out.println("StringToOrderConverter convert:" + json);
        OrderDTO orderDTO = JSON.parseObject(json,OrderDTO.class);
        return  orderDTO;
    }

}
