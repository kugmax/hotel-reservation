package com.kugmax.learn.hotel.hotelservice.repository;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDaoCassandra implements HotelDao {
    @Autowired
    private CassandraTemplate cassandraTemplate;

    @Override
    public List<Hotel> findHotelsByPoi(String poi) {

//        address  frozen<address>,
//TODO
//        ConverterNotFoundException: No converter found capable of converting from type [com.datastax.driver.core.UDTValue] to type [com.kugmax.learn.hotel.hotelservice.model.Address]

        String cql = "select poi_name, hotel_id, name, phone from hotels_by_poi where poi_name = ?";

        return cassandraTemplate.select(cql , Hotel.class);
    }

    @Override
    public Hotel get(String id) {
        return cassandraTemplate.selectOneById(id, Hotel.class);
    }
}
