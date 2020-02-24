package com.kugmax.learn.hotel.hotelservice.model;

import com.datastax.driver.core.LocalDate;
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
public class Room {

    private String hotelId;
    private LocalDate date;
    private Integer roomNumber;
    private boolean isAvailable;
}
