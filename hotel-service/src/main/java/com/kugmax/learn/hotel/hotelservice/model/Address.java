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
public class Address {
    private String street;
    private String city;
    private String stateOrProvince;
    private String postalCode;
    private String country;
}
