package com.kugmax.learn.hotel.hotelservice.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;

@Configuration
public class CassandraConfig {

    private final String hotelKeyspace = "hotel";

    @Bean
    public Cluster cluster() {
        return Cluster.builder()
            .addContactPoints("localhost")
            .build();
    }

    @Bean
    public Session session(Cluster cluster) {
        return cluster.connect(hotelKeyspace);
    }

    @Bean
    public CassandraMappingContext mappingContext(Cluster cluster) {
        CassandraMappingContext mappingContext = new CassandraMappingContext();
        mappingContext.setUserTypeResolver(new SimpleUserTypeResolver(cluster, hotelKeyspace));
        return mappingContext;
    }
}
