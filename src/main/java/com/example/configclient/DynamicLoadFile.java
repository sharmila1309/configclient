package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * Created by admin on 2/23/20.
 */
@Service
public class DynamicLoadFile {

    private static DynamicLoadFile dynamicLoadFile=null;

    @Autowired
    private Environment env;

    @PostConstruct
    public  void init(){
        env.getDefaultProfiles();
    }

    public static synchronized  DynamicLoadFile getInstance(){
       return new DynamicLoadFile();
    }

    Properties getProperties() {
        Properties props = new Properties();
        CompositePropertySource bootstrapProperties = (CompositePropertySource)  ((AbstractEnvironment) env).getPropertySources().get("mytest.properties");
        for (String propertyName : bootstrapProperties.getPropertyNames()) {
            System.out.println("sharmila name"+propertyName);
            System.out.println("sharmila value"+bootstrapProperties.getProperty(propertyName));
            props.put(propertyName, bootstrapProperties.getProperty(propertyName));
        }

        return props;
    }
}
