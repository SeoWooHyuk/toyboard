package com.restfulproject.toyboard.openapi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Camping {
    private String facility_name;
    private String category1;
    private String category2;
    private String category3;

    private String sido_name;
    private String sigungu_name;
    private String eupmyeondong_name;
    private String ri_name;
    private String bungi;
    private String road_name;
    private String building_num;

    private Double latitude;
    private Double longitude;

    private String zip_code;
    private String road_address;
    private String jibun_address;

    private String phone_num;
    private String website;
    private String business_entity;
    private String weekday_operating_hours;
    private String weekend_operating_hours;
    private String spring_operating_hours;
    private String summer_operating_hours;
    private String fall_operating_hours;
    private String winter_operating_hours;

    private String amenities_electricity;
    private String amenities_hot_water;
    private String amenities_wifi;
    private String amenities_firewood_sales;
    private String amenities_hiking_trail;
    private String amenities_water_playground;
    private String amenities_playground;
    private String amenities_mart;
    private String amenities_restroom_num;
    private String amenities_shower_room_num;
    private String amenities_sink_num;
    private String amenities_fire_extinguisher_num;

    private String surrounding_facilities_fishing;
    private String surrounding_facilities_hiking_trail;
    private String surrounding_facilities_water_play_cool;
    private String surrounding_facilities_water_play_leisure;
    private String surrounding_facilities_water_play_gorge;
    private String surrounding_facilities_water_play_river;
    private String surrounding_facilities_water_play_pool;
    private String surrounding_facilities_youth_experience;
    private String surrounding_facilities_rural_experience;
    private String surrounding_facilities_children_playground;

    private String glamping_bed;
    private String glamping_tv;
    private String glamping_refrigerator;
    private String glamping_wireless_internet;
    private String glamping_internal_bathroom;
    private String glamping_airconditioner;
    private String glamping_heating_equipment;
    private String glamping_cooking_tools;
    private String facility_features;
    private String facility_introduction;
    private String last_update_date;

    public Camping() {
    }

    public Camping(String facility_name, String category1, String category2, String category3, String sido_name,
            String sigungu_name, String eupmyeondong_name, String ri_name, String bungi, String road_name,
            String building_num, Double latitude, Double longitude, String zip_code, String road_address,
            String jibun_address, String phone_num, String website, String business_entity,
            String weekday_operating_hours, String weekend_operating_hours, String spring_operating_hours,
            String summer_operating_hours, String fall_operating_hours, String winter_operating_hours,
            String amenities_electricity, String amenities_hot_water, String amenities_wifi,
            String amenities_firewood_sales, String amenities_hiking_trail, String amenities_water_playground,
            String amenities_playground, String amenities_mart, String amenities_restroom_num,
            String amenities_shower_room_num, String amenities_sink_num, String amenities_fire_extinguisher_num,
            String surrounding_facilities_fishing, String surrounding_facilities_hiking_trail,
            String surrounding_facilities_water_play_cool, String surrounding_facilities_water_play_leisure,
            String surrounding_facilities_water_play_gorge, String surrounding_facilities_water_play_river,
            String surrounding_facilities_water_play_pool, String surrounding_facilities_youth_experience,
            String surrounding_facilities_rural_experience, String surrounding_facilities_children_playground,
            String glamping_bed, String glamping_tv, String glamping_refrigerator, String glamping_wireless_internet,
            String glamping_internal_bathroom, String glamping_airconditioner, String glamping_heating_equipment,
            String glamping_cooking_tools, String facility_features, String facility_introduction,
            String last_update_date) {
                super();
        this.facility_name = facility_name;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.sido_name = sido_name;
        this.sigungu_name = sigungu_name;
        this.eupmyeondong_name = eupmyeondong_name;
        this.ri_name = ri_name;
        this.bungi = bungi;
        this.road_name = road_name;
        this.building_num = building_num;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zip_code = zip_code;
        this.road_address = road_address;
        this.jibun_address = jibun_address;
        this.phone_num = phone_num;
        this.website = website;
        this.business_entity = business_entity;
        this.weekday_operating_hours = weekday_operating_hours;
        this.weekend_operating_hours = weekend_operating_hours;
        this.spring_operating_hours = spring_operating_hours;
        this.summer_operating_hours = summer_operating_hours;
        this.fall_operating_hours = fall_operating_hours;
        this.winter_operating_hours = winter_operating_hours;
        this.amenities_electricity = amenities_electricity;
        this.amenities_hot_water = amenities_hot_water;
        this.amenities_wifi = amenities_wifi;
        this.amenities_firewood_sales = amenities_firewood_sales;
        this.amenities_hiking_trail = amenities_hiking_trail;
        this.amenities_water_playground = amenities_water_playground;
        this.amenities_playground = amenities_playground;
        this.amenities_mart = amenities_mart;
        this.amenities_restroom_num = amenities_restroom_num;
        this.amenities_shower_room_num = amenities_shower_room_num;
        this.amenities_sink_num = amenities_sink_num;
        this.amenities_fire_extinguisher_num = amenities_fire_extinguisher_num;
        this.surrounding_facilities_fishing = surrounding_facilities_fishing;
        this.surrounding_facilities_hiking_trail = surrounding_facilities_hiking_trail;
        this.surrounding_facilities_water_play_cool = surrounding_facilities_water_play_cool;
        this.surrounding_facilities_water_play_leisure = surrounding_facilities_water_play_leisure;
        this.surrounding_facilities_water_play_gorge = surrounding_facilities_water_play_gorge;
        this.surrounding_facilities_water_play_river = surrounding_facilities_water_play_river;
        this.surrounding_facilities_water_play_pool = surrounding_facilities_water_play_pool;
        this.surrounding_facilities_youth_experience = surrounding_facilities_youth_experience;
        this.surrounding_facilities_rural_experience = surrounding_facilities_rural_experience;
        this.surrounding_facilities_children_playground = surrounding_facilities_children_playground;
        this.glamping_bed = glamping_bed;
        this.glamping_tv = glamping_tv;
        this.glamping_refrigerator = glamping_refrigerator;
        this.glamping_wireless_internet = glamping_wireless_internet;
        this.glamping_internal_bathroom = glamping_internal_bathroom;
        this.glamping_airconditioner = glamping_airconditioner;
        this.glamping_heating_equipment = glamping_heating_equipment;
        this.glamping_cooking_tools = glamping_cooking_tools;
        this.facility_features = facility_features;
        this.facility_introduction = facility_introduction;
        this.last_update_date = last_update_date;
    }

    

    
}
