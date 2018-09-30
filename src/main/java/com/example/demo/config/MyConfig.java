package com.example.demo.config;

import com.example.demo.Filter.MyFilter;
import com.example.demo.listener.MyListener;
import com.example.demo.servlet.MyServlet;

import org.apache.catalina.manager.ManagerServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class MyConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return  servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean MyFilter(){
       /* FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(MyFilter(),"/myservlet");*/
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myservlet"));
        return  filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean mylistener(){
        ServletListenerRegistrationBean<MyListener> myListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return  myListenerServletListenerRegistrationBean;
    }



}
