package com.jf.apps.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 自定义部分属性
 * 最大行数: 10 万
 * @author sun
 * TODO
 * May 11, 2017
 */
@Configuration
public class JdbcTeamplateCfg {
	@Resource
	DataSource dataSource;
	
    @Bean
    public JdbcTemplate jdbcTemplate(){
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	jdbcTemplate.setMaxRows(5*1000);
    	jdbcTemplate.setDataSource(dataSource); 
        return jdbcTemplate;
    }
}
