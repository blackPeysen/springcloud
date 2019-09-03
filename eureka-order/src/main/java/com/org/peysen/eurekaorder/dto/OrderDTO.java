package com.org.peysen.eurekaorder.dto;

import com.org.peysen.eurekaorder.entity.OrderDetail;
import com.org.peysen.eurekaorder.entity.OrderMaster;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/3 15:02
 */
@Data
@Valid
public class OrderDTO {

    private OrderMaster orderMaster;

    @NotEmpty(message="购物车不能为空")
    private List<OrderDetail> orderDetailList;
}
