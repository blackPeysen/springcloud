package com.org.peysen.eurekacommon.feignClient;

/**
 * @Description: 提供eureka-goods服务下的对外接口
 *  通过@FeignClient注解指定服务名来绑定服务
 *  这里的服务名字不区分大小写
 *  然后再通过@RequestMapping来绑定服务下的rest接口
 * Created by mengmeng.Pei
 * 2019/9/4 13:32
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eureka-goods")
public interface FeignGoodsClient {

    @RequestMapping(method = RequestMethod.POST,value = "/config/dataSource")
    String getDataSource();


    @RequestMapping(method = RequestMethod.POST,value = "/goods/updateStock")
    String updateStock();

}
