package me.spring.mvc.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * Created on 2017/8/6.
 */
@Configuration
@ComponentScan(basePackages = {"me.spring.mvc"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
//排除@controller注解
public class RootConfig {

    @Bean(destroyMethod = "close",initMethod = "")
    @Lazy(false)
    public HikariDataSource dataSource(){
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/gx");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setAutoCommit(true);
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setConnectionTimeout(6000);
        ds.setConnectionTestQuery("SELECT * FROM `evl21`");
        ds.setConnectionInitSql("SELECT * FROM `evl222`");
        ds.setConnectionTimeout(30000);
        ds.setMaximumPoolSize(10);
        ds.setMinimumIdle(10);
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSourceTransactionManager txManager (DataSource dataSource){
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource);
        return manager;
    }
}
