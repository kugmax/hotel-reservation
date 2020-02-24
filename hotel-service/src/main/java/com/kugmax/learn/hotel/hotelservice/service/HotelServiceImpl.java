package com.kugmax.learn.hotel.hotelservice.service;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.model.Poi;
import com.kugmax.learn.hotel.hotelservice.model.Room;
import com.kugmax.learn.hotel.hotelservice.repository.HotelDao;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Hotel> findHotelsByPoi(String poi) {
        return hotelDao.findHotelsByPoi(poi);
    }

    @Override
    public Hotel get(String id) {
        return hotelDao.get(id);
    }

    @Override
    public List<Poi> findPoisByHotel(String hotelId) {
        return hotelDao.findPoisByHotel(hotelId);
    }

    @Override
    public List<Room> findAvailableRoomsByHotel(String hotelId, LocalDate fromDate, LocalDate toDate) {
        return hotelDao.findAvailableRoomsByHotel(hotelId, fromDate, toDate);
    }
}
