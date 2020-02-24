package com.kugmax.learn.hotel.hotelservice.dot;

import com.kugmax.learn.hotel.hotelservice.model.Address;
import java.util.Set;
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
public class HotelInfoDto {
    private Address address;

    private String name;
    private String phone;
    private Set<String> pois;
}
