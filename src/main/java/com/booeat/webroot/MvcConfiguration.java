package com.booeat.webroot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	/*
	 * @Override public void configureViewResolvers(ViewResolverRegistry registry) {
	 * // TODO Auto-generated method stub InternalResourceViewResolver resolver =
	 * new InternalResourceViewResolver("/resource/static/html/", ".html");
	 * registry.viewResolver(resolver); }
	 */
}
