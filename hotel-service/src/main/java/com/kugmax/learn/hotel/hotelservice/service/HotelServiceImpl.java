package com.kugmax.learn.hotel.hotelservice.service;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.repository.HotelDao;
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
}
