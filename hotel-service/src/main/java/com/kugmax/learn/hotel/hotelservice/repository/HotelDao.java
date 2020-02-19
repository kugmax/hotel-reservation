package com.kugmax.learn.hotel.hotelservice.repository;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HotelDao {
    //    Q1. Find hotels near a given point of interest.
    List<Hotel> findHotelsByPoi(String poi);

    //    Q2. Find information about a given hotel, such as its name and location.

    Hotel get(String id);

    //    Q3. Find points of interest near a given hotel.
    //    Q4. Find an available room in a given date range.
    //    Q5. Find the rate and amenities for a room.

}
