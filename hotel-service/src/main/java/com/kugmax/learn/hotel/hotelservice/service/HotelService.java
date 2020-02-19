package com.kugmax.learn.hotel.hotelservice.service;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import java.util.List;

public interface HotelService {
    List<Hotel> findHotelsByPoi(String poi);
    Hotel get(String id);

}
