package com.test.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {"com.test.controller"})
public class ServletConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		
		registry.viewResolver(bean);
	}
	
	@Bean
	public CommonsMultipartResolver getResolver() throws IOException {
		CommonsMultipartResolver resovler = new CommonsMultipartResolver();
		
		resovler.setDefaultEncoding("utf-8");
		resovler.setMaxUploadSize(10 * 1024 * 1024);
		resovler.setMaxUploadSizePerFile(2 * 1024 * 1024);
		resovler.setUploadTempDir(new FileSystemResource("d:\\upload\\tmp"));
		resovler.setMaxInMemorySize(10 * 1024 * 1024);
		
		return resovler;
	}
	
}