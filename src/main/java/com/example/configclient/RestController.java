package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by admin on 2/23/20.
 */

//@org.springframework.web.bind.annotation.RestController

@Configuration
@RefreshScope
public class RestController {


    @Value("${my.envrionment}")
    private String myValue;

    @Value("${config.db}")
    private String dbconfig;


    @PostConstruct
    public  void init(){
        System.out.println("shammu"+myValue);
        System.out.println("shammu db"+dbconfig);
    }





    public String getMyValue() {
        return myValue;
    }

    public void setMyValue(String myValue) {
        this.myValue = myValue;
    }
}