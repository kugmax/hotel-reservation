package com.kugmax.learn.hotel.hotelservice.controller;

import com.kugmax.learn.hotel.hotelservice.dot.HotelInfoDto;
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
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hotel")
@Controller
public class HotelController {

    private static final Log log = LogFactory.getLog(HotelController.class);

    @Autowired
    private HotelService hotelService;

    //    Q1. Find hotels near a given point of interest.
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Hotel> getHotels(@RequestParam("poi") String poi) {

        log.info("getHotels, poi=" + poi);

        List<Hotel> result = hotelService.findHotelsByPoi(poi);

        log.info("getHotels: " + result);

        return result;
    }

    //    Q2. Find information about a given hotel, such as its name and location.
    @ResponseBody
    @RequestMapping(value = "/{hotelId}/", method = RequestMethod.GET)
    public HotelInfoDto getHotel(@PathVariable("hotelId") String hotelId) {

        Hotel hotel = hotelService.get(hotelId);

        log.info("getHotel: " + hotel);

        HotelInfoDto result = new HotelInfoDto();
        result.setAddress(hotel.getAddress());
        result.setName(hotel.getName());
        result.setPhone(hotel.getPhone());
        result.setPois(hotel.getPois());

        return result;
    }

    //    Q3. Find points of interest near a given hotel.
    @ResponseBody
    @RequestMapping(value = "/poi/", method = RequestMethod.GET)
    public Map<String, String> getPois(@RequestParam("hotelId") String hotelId) {
        return null;
    }

    //    Q4. Find an available room in a given date range.
    @ResponseBody
    @RequestMapping(value = "/{hotelId}/room/", method = RequestMethod.GET)
    public Map<String, String> getRooms(@PathVariable("hotelId") String hotelId,
        @RequestParam("fromDate") Instant fromDate, @RequestParam("toDate") Instant toDate) {
        return null;
    }

    //    Q5. Find the rate and amenities for a room.
    @ResponseBody
    @RequestMapping(value = "/{hotelId}/room/{roomId}/", method = RequestMethod.GET)
    public Map<String, String> getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId) {
        return null;
    }
}
