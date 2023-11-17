package com.develop24k.poc.db;

import org.hibernate.dialect.Dialect;
import org.hibernate.jpa.internal.JpaComplianceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.sqlite.hibernate.dialect.SQLiteDialect;

import javax.sql.DataSource;

@Configuration
public class PocDbConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource1")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.jpa.properties.hibernate.dialect1")
    public Dialect primaryHibernateJpaDialect() {
        return new SQLiteDialect();
    }

}
