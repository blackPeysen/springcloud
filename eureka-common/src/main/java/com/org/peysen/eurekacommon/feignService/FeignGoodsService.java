package com.org.peysen.eurekacommon.feignService;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 13:32
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过@FeignClient注解指定服务名来绑定服务
 *  这里的服务名字不区分大小写
 *  然后再通过@RequestMapping来绑定服务下的rest接口
 *
 */

//@Component
//@FeignClient(name="eureka-goods")
public interface FeignGoodsService {

    @RequestMapping("/config/dataSource")
    String getDataSource();

}
