package com.kugmax.learn.hotel.hotelservice.model;

import com.datastax.driver.core.DataType;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table("hotels")
public class Hotel {
    @PrimaryKey
    private String id;

    @CassandraType(type = DataType.Name.UDT, userTypeName = "address")
    private Address address;

    private String name;
    private String phone;
    private Set<String> pois;
}
