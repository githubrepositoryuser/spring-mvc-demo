package com.demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.repository.JdbcDataSource;

@RestController
public class DataSourceController implements ApplicationContextAware {
	
    private ApplicationContext applicationContext;
    
	@RequestMapping(value = "/db-source")
	public JdbcDataSource getDataSource() {
		//applicationContext = new ClassPathXmlApplicationContext("jdbc\\jdbcContext.xml");
		JdbcDataSource jdbcDataSource = applicationContext.getBean("jdbcDataSource", JdbcDataSource.class);
		return jdbcDataSource;

	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
}
