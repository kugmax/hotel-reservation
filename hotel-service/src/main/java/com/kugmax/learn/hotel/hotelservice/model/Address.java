package com.kugmax.learn.hotel.hotelservice.model;

import com.datastax.driver.core.DataType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@UserDefinedType("address")
public class Address {
    @CassandraType(type = DataType.Name.TEXT)
    private String street;

    @CassandraType(type = DataType.Name.TEXT)
    private String city;

    @CassandraType(type = DataType.Name.TEXT)
    private String stateOrProvince;

    @CassandraType(type = DataType.Name.TEXT)
    private String postalCode;

    @CassandraType(type = DataType.Name.TEXT)
    private String country;
}
