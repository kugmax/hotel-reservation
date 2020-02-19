package com.kugmax.learn.hotel.hotelservice.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfig {

    public @Bean Session session() {
        Cluster cluster = Cluster.builder()
            .addContactPoints("localhost")
            .build();
        return cluster.connect("hotel");
    }
}
