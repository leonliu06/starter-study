package com.mrliuli.starterstudy.config;

import com.mrliuli.starterstudy.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuli on 2019/12/13.
 *
 * AutoConfigure类
 *
 */
@Configuration
@ConditionalOnClass(MyService.class)
@EnableConfigurationProperties(MyServiceProperties.class)
public class MyServiceAutoConfigure {

    @Autowired
    private MyServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "my.service", value = "enabled", havingValue = "true")
    MyService starterService(){
        return new MyService(properties.getConfig());
    }

}
