package com.ClassList.ClassBuilder.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

	//The h2 connection for this was jdbc:h2:mem:testdb --- Before you login, be sure you have the proper H2 database settings. I had a hard time finding the default values used by Spring Boot, and had to use Hibernate logging to find out what the JDBC Url was being used by Spring Boot.
    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");

        return registrationBean;
    }
}