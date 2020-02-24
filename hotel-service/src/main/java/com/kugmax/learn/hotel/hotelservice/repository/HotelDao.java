package com.kugmax.learn.hotel.hotelservice.repository;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.model.Poi;
import com.kugmax.learn.hotel.hotelservice.model.Room;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.cassandra.repository.AllowFiltering;

public interface HotelDao {
    //    Q1. Find hotels near a given point of interest.
    List<Hotel> findHotelsByPoi(String poi);

    //    Q2. Find information about a given hotel, such as its name and location.
    Hotel get(String id);

    //    Q3. Find points of interest near a given hotel.
    List<Poi>findPoisByHotel(String hotelId);

    //    Q4. Find an available room in a given date range.
    List<Room> findAvailableRoomsByHotel(String hotelId, LocalDate fromDate, LocalDate toDate);


    //    Q5. Find the rate and amenities for a room.

}
