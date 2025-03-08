package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.core.transaction.Neo4jTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class Neo4jConfig {

    @Bean
    public PlatformTransactionManager transactionManager(org.neo4j.driver.Driver driver) {
        return new Neo4jTransactionManager(driver);
    }
}
