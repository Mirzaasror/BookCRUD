package com.example.bookcrud.config;

import com.example.bookcrud.book.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class WebMvcConfig {
    @Bean
    public JdbcTemplate jdbcTemplate(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/crud11");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123");


        return new JdbcTemplate(dataSource);
    }
    @Bean
    public Book Book(){
        return new Book();
    }
}
