package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigclientApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
       // DynamicLoadFile.getInstance().getProperties();
       //TestRead.getActiveMQHost();

       /// RestController mm=new RestController();
//        mm.getMyValue();
	}

}
