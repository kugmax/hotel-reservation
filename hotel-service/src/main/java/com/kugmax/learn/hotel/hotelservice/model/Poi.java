package com.kugmax.learn.hotel.hotelservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Poi {

    private String poi_name;
    private String hotelId;
    private String description;
}
