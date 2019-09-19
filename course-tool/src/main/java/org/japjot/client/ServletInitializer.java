package org.japjot.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer{

	public static final Logger logger = LoggerFactory.getLogger(ServletInitializer.class);
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(AppMain.class);
	}
}
