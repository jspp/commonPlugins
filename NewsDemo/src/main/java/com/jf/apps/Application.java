package com.jf.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Application {
    /** 
     * 启动入口
     * @param args
     * @author sun
     * May 9, 2017
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
 
