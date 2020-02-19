-- hotels
insert into hotel.hotels (id, address, name, phone, pois) values (
    'hotel_1',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Chreshatik', postal_code: '1'},
    'Nice hotel 1', '001',
    {'Poi 1', 'Poi 2', 'Poi 3' }
);

insert into hotel.hotels (id, address, name, phone, pois) values (
    'hotel_2',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Nevska', postal_code: '2'},
    'Nice hotel 2', '002',
{'Poi 2'}
);

-- hotels_by_poi
insert into hotel.hotels_by_poi (poi_name, hotel_id, address, name, phone) values (
    'Poi 1', 'hotel_1',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Chreshatik', postal_code: '1'},
    'Nice hotel 1', '001'
);

insert into hotel.hotels_by_poi (poi_name, hotel_id, address, name, phone) values (
    'Poi 2', 'hotel_1',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Chreshatik', postal_code: '1'},
    'Nice hotel 1', '001'
);

insert into hotel.hotels_by_poi (poi_name, hotel_id, address, name, phone) values (
    'Poi 2', 'hotel_2',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Nevska', postal_code: '2'},
    'Nice hotel 2', '002'
);

insert into hotel.hotels_by_poi (poi_name, hotel_id, address, name, phone) values (
    'Poi 3', 'hotel_1',
    {country:'UA', state_or_province: 'Kyiv', city: 'Kyiv', street: 'Chreshatik', postal_code: '1'},
    'Nice hotel 1', '001'
);

-- pois_by_hotel
insert into hotel.pois_by_hotel (hotel_id, poi_name, description) VALUES (
'hotel_1', 'Poi 1', 'Its ok'
);

insert into hotel.pois_by_hotel (hotel_id, poi_name, description) VALUES (
 'hotel_1', 'Poi 2', 'Its ok also'
);

insert into hotel.pois_by_hotel (hotel_id, poi_name, description) VALUES (
 'hotel_2', 'Poi 2', 'Its ok also'
);

insert into hotel.pois_by_hotel (hotel_id, poi_name, description) VALUES (
'hotel_1', 'Poi 3', 'Dont go there'
);

-- available_rooms_by_hotel_date
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-01', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-02', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-03', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-04', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-06', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-01', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-02', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-03', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-04', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_1', '2020-03-06', 2, true);

insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-01', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-02', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-03', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-04', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-06', 1, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-01', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-02', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-03', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-04', 2, true);
insert into hotel.available_rooms_by_hotel_date (hotel_id, date, room_number, is_available) VALUES ('hotel_2', '2020-03-06', 2, true);

-- amenities_by_room
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_1', 1, 'roof', 'It is roof');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_1', 1, 'floor', 'It is floor');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_1', 2, 'roof', 'It is roof');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_1', 2, 'floor', 'It is floor');

insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_2', 1, 'bed', 'It is bed');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_2', 1, 'table', 'It is table');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_2', 2, 'bed', 'It is bed');
insert into hotel.amenities_by_room (hotel_id, room_number, amenity_name, description) VALUES ('hotel_2', 2, 'table', 'It is table');