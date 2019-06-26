package com.Semafoor.ToDoList.config;

import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
public class DataBaseConfig {

    @Value("postgres://hpdvjhhcethmcx:95815ced1cd592dfa8710de657d55bf187752abbb8d609c45557e561aebd7758@ec2-174-129-41-127.compute-1.amazonaws.com:5432/d66h65o252cps1")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}