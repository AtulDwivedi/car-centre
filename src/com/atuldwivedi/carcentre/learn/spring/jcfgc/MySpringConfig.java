package com.atuldwivedi.carcentre.learn.spring.jcfgc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.atuldwivedi.carcentre.learn.spring.jcfgc")
@PropertySource("classpath:car.properties")
public class MySpringConfig {

}
