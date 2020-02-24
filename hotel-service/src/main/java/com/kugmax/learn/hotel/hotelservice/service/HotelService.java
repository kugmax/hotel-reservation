package com.kugmax.learn.hotel.hotelservice.service;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.model.Poi;
import com.kugmax.learn.hotel.hotelservice.model.Room;
import java.time.LocalDate;
import java.util.List;

public interface HotelService {
    List<Hotel> findHotelsByPoi(String poi);
    Hotel get(String id);
    List<Poi> findPoisByHotel(String hotelId);

    List<Room> findAvailableRoomsByHotel(String hotelId, LocalDate fromDate, LocalDate toDate);
}
