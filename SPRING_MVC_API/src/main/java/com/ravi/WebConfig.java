package com.ravi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.ravi")
@EnableWebMvc
@Configuration
@EnableAspectJAutoProxy
public class WebConfig {

}
