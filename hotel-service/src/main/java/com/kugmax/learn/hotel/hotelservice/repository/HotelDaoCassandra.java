package com.kugmax.learn.hotel.hotelservice.repository;

import com.datastax.driver.core.SimpleStatement;
import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDaoCassandra implements HotelDao {
    @Autowired
    private CassandraTemplate cassandraTemplate;

    @Override
    public List<Hotel> findHotelsByPoi(String poi) {

        String cql = "select poi_name, hotel_id as id, name, phone from hotels_by_poi where poi_name = ?";

        return cassandraTemplate.select(new SimpleStatement(cql, poi) , Hotel.class);
    }

    @Override
    public Hotel get(String id) {
        return cassandraTemplate.selectOneById(id, Hotel.class);
    }
}
