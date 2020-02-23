package com.example.configclient;

import org.bouncycastle.util.test.Test;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by admin on 2/23/20.
 */

@Configuration
//@PropertySource("classpath:mytest.properties")
public class TestRead implements EnvironmentAware {


    static Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        TestRead.environment = environment;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static String getActiveMQHost() {
        System.out.println(environment.getProperty("my.envrionment"));
        return environment.getProperty("my.envrionment");
    }
}
