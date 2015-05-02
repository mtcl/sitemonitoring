package com.mtcl.sitemonitoring;

import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyWebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext container) {

		// create root spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfiguration.class);

		// Manage life cycle of root application context
		container.addListener(new ContextLoaderListener(rootContext));

	}

}
