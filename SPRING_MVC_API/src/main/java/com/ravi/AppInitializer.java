package com.ravi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.ravi.filters.LoggingFilter;

import jakarta.servlet.FilterRegistration;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

//		create application context
//		create and register dispatcher servlet
//		add servlet on startup
//		create and register filters

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		context.register(WebConfig.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		ServletRegistration.Dynamic registration = servletContext.addServlet("dispathcer", dispatcherServlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		
		FilterRegistration.Dynamic filterRegistration= servletContext.addFilter("myLoggingFilter", new LoggingFilter());
		
		filterRegistration.addMappingForUrlPatterns(null, false, "/*");

	}

}
