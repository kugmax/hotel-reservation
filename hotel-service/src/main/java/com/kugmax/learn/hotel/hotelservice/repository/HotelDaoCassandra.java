package com.kugmax.learn.hotel.hotelservice.repository;

import com.datastax.driver.core.SimpleStatement;
import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.model.Poi;
import com.kugmax.learn.hotel.hotelservice.model.Room;
import java.util.List;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDaoCassandra implements HotelDao {
    private static final Log log = LogFactory.getLog(HotelDaoCassandra.class);


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

    @Override
    public List<Poi> findPoisByHotel(String hotelId) {
        String cql = "select poi_name, hotel_id as hotelId, description from pois_by_hotel where hotel_id = ?";

        return cassandraTemplate.select(new SimpleStatement(cql, hotelId), Poi.class);
    }

    @Override
    public List<Room> findAvailableRoomsByHotel(String hotelId, java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        String cql = "select hotel_id as hotelId, date, room_number as roomNumber, is_available as isAvailable "
            + "from available_rooms_by_hotel_date "
            + "where hotel_id = ? "
            + "and date >= ? and date <= ? ";

        log.info(fromDate.toString()  + " " + toDate.toString());

        com.datastax.driver.core.LocalDate cassandraFromDate = com.datastax.driver.core.LocalDate.fromDaysSinceEpoch((int)fromDate.toEpochDay());
        com.datastax.driver.core.LocalDate cassandraToDate = com.datastax.driver.core.LocalDate.fromDaysSinceEpoch((int)toDate.toEpochDay());

        return cassandraTemplate.select(new SimpleStatement(cql, hotelId, cassandraFromDate, cassandraToDate), Room.class);
    }
}
