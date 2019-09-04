package com.org.peysen.eurekaorder.feignService;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 13:32
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 通过@FeignClient注解指定服务名来绑定服务
 *  这里的服务名字不区分大小写
 *  然后再通过@RequestMapping来绑定服务下的rest接口
 *
 */

@Component
@FeignClient(name="EUREKA-GOODS")
public interface FeignGoodsService {

    @RequestMapping(method = RequestMethod.POST,value = "/config/dataSource")
    String getDataSource();

}
