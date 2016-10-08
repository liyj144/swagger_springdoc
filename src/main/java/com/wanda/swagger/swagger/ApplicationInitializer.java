package com.wanda.swagger.swagger;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by yanjie on 2016/9/26.
 */
public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setInitParameter("contextConfigLocation", "classpath:spring/*.xml");
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }
}