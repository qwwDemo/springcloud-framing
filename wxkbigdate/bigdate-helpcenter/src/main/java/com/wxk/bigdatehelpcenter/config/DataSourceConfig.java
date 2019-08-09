package com.wxk.bigdatehelpcenter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: qww
 * @vsersion 1.0
 * @Date: 2019/8/8 17:05
 */
//远程数据源设置
@Configuration
//刷新配置
//@RefreshScope
public class DataSourceConfig {
    @Value("${datasource.driver-class-name}")
    String driver;
    @Value("${datasource.jdbc-url}")
    String url;
    @Value("${datasource.username}")
    String userName;
    @Value("${datasource.password}")
    String password;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driver);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(userName);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }
}