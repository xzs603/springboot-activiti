package com.uih.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.uih.activiti", "org.activiti"})
public class DesignerApp
{
    public static void main(String[] args) {
        SpringApplication.run(DesignerApp.class, args);
    }
}
