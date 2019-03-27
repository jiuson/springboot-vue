package com.example.springbootvue.springbootweb.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @program: springboot-vue
 * @descripttion: Druid的DataSource配置类
 * @author: jiuson
 * @create: 2019-03-27 17:51:26
 */
@Slf4j
public class DruidDataSourceConfig implements EnvironmentAware {

    private RelaxedPropertyResolver relaxedPropertyResolver;

    public void setEnvironment(Environment environment) {
        this.relaxedPropertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource");
    }

    /**
     * 创建一个druid的DruidDataSource，返回并告诉SpringBoot这是一个Bean
     * @return
     */
    @Bean
    public DataSource dataSource(){
        log.info("注入druid---");
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(relaxedPropertyResolver.getProperty("url"));
        druidDataSource.setDriverClassName(relaxedPropertyResolver.getProperty("driver-class-name"));
        druidDataSource.setUsername(relaxedPropertyResolver.getProperty("username"));
        druidDataSource.setPassword(relaxedPropertyResolver.getProperty("password"));
        druidDataSource.setInitialSize(Integer.valueOf(relaxedPropertyResolver.getProperty("initial-size")));
        druidDataSource.setMinIdle(Integer.valueOf(relaxedPropertyResolver.getProperty("min-idle")));
        druidDataSource.setMaxWait(Long.valueOf(relaxedPropertyResolver.getProperty("max-wait")));
        druidDataSource.setMaxWait(Integer.valueOf(relaxedPropertyResolver.getProperty("max-active")));
        druidDataSource.setMinEvictableIdleTimeMillis(Long.valueOf(relaxedPropertyResolver.getProperty("min-evictable-idle-time-millis")));
        try {
            druidDataSource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
