package com.mrliuli.starterstudy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by liuli on 2019/12/13.
 *
 * 读取配置文件
 *
 */
@ConfigurationProperties("my.service")
public class MyServiceProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
