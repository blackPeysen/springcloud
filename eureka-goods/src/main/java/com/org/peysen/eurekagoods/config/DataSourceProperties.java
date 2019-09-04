package com.org.peysen.eurekagoods.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * Created by mengmeng.Pei
 * 2019/9/4 11:01
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@RefreshScope
@Data
public class DataSourceProperties {

    private String username;

    private String password;

    private String url;

    private String driverClassName;

    private String test;

}
