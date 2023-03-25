package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
public class Configurations {

}
