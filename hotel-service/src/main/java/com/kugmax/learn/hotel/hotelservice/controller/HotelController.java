package com.kugmax.learn.hotel.hotelservice.controller;

import com.kugmax.learn.hotel.hotelservice.model.Hotel;
import com.kugmax.learn.hotel.hotelservice.service.HotelService;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hotel")
@Controller
public class HotelController {

    private static final Log log = LogFactory.getLog(HotelController.class);

    @Autowired
    private HotelService hotelService;

    //    Q1. Find hotels near a given point of interest.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Hotel> getHotels(@RequestParam("poi") String poi) {

        List<Hotel> result = hotelService.findHotelsByPoi(poi);

        log.info(result);

        return result;
    }

    //    Q2. Find information about a given hotel, such as its name and location.
    @RequestMapping(value = "/{hotelId}/", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable("hotelId") String hotelId) {

        Hotel hotel = hotelService.get(hotelId);

        log.info(hotel);

        return hotel;
    }

    //    Q3. Find points of interest near a given hotel.
    @RequestMapping(value = "/poi/", method = RequestMethod.GET)
    public Map<String, String> getPois(@RequestParam("hotelId") String hotelId) {
        return null;
    }

    //    Q4. Find an available room in a given date range.
    @RequestMapping(value = "/{hotelId}/room/", method = RequestMethod.GET)
    public Map<String, String> getRooms(@PathVariable("hotelId") String hotelId,
        @RequestParam("fromDate") Instant fromDate, @RequestParam("toDate") Instant toDate) {
        return null;
    }

    //    Q5. Find the rate and amenities for a room.
    @RequestMapping(value = "/{hotelId}/room/{roomId}/", method = RequestMethod.GET)
    public Map<String, String> getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId) {
        return null;
    }
}
