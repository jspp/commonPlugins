package com.jf.apps.configration;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.JdbcConstants;
import com.alibaba.druid.wall.WallFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据源配置
 * @author sun
 * TODO
 * May 9, 2017
 */
@Configuration
public class DataSourceCfg {
	@Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() throws SQLException { 
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
        dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(50);
        dataSource.setMinIdle(5);
        dataSource.setMaxWait(1000);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(true);
        dataSource.setTestWhileIdle(true);
        WallFilter wall = new WallFilter();
        wall.setDbType(JdbcConstants.MYSQL);
        List<Filter> filters = new ArrayList<>();
        filters.add(wall); 
        dataSource.setProxyFilters(filters);
        return dataSource;
    }
}
