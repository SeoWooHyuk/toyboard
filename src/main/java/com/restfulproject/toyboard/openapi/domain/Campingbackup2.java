package com.restfulproject.toyboard.openapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Campingbackup2 {

    @JsonProperty(value = "시설명")
    private String facility_name;

    @JsonProperty(value = "카테고리1")
    private String category1;

    @JsonProperty(value = "카테고리2")
    private String category2;

    @JsonProperty(value = "카테고리3")
    private String category3;

    @JsonProperty(value = "시도명칭")
    private String sido_name;
    @JsonProperty(value = "시군구명칭")
    private String sigungu_name;
    @JsonProperty(value = "법정읍면동명칭")
    private String eupmyeondong_name;
    @JsonProperty(value = "리명칭")
    private String ri_name;
    @JsonProperty(value = "번지가변문자형")
    private String bungi;
    @JsonProperty(value = "도로명이름")
    private String road_name;
    @JsonProperty(value = "건물번호")
    private String building_num;

    @JsonProperty(value = "위도")
    private Double latitude;
    @JsonProperty(value = "경도")
    private Double longitude;

    @JsonProperty(value = "우편번호")
    private String zip_code;
    @JsonProperty(value = "도로명주소")
    private String road_address;
    @JsonProperty(value = "지번주소")
    private String jibun_address;

    @JsonProperty(value = "전화번호")
    private String phone_num;
    @JsonProperty(value = "홈페이지")
    private String website;
    @JsonProperty(value = "사업주체")
    private String business_entity;
    @JsonProperty(value = "평일운영여부")
    private String weekday_operating_hours;
    @JsonProperty(value = "주말운영 여부")
    private String weekend_operating_hours;
    @JsonProperty(value = "봄운영여부")
    private String spring_operating_hours;
    @JsonProperty(value = "여름운영여부")
    private String summer_operating_hours;
    @JsonProperty(value = "가을운영여부")
    private String fall_operating_hours;
    @JsonProperty(value = "겨울운영여부")
    private String winter_operating_hours;


    @JsonProperty(value = "부대시설전기")
    private String amenities_electricity;
    @JsonProperty(value = "부대시설온수")
    private String amenities_hot_water;
    @JsonProperty(value = "부대시설무선인터넷")
    private String amenities_wifi;
    @JsonProperty(value = "부대시설장작판매")
    private String amenities_firewood_sales;
    @JsonProperty(value = "부대시설산책로")
    private String amenities_hiking_trail;
    @JsonProperty(value = "부대시설물놀이장")
    private String amenities_water_playground;
    @JsonProperty(value = "부대시설놀이터")
    private String amenities_playground;
    @JsonProperty(value = "부대시설마트")
    private String amenities_mart;
    @JsonProperty(value = "부대시설화장실수")
    private String amenities_restroom_num;
    @JsonProperty(value = "부대시설샤워실수")
    private String amenities_shower_room_num;
    @JsonProperty(value = "부대시설씽크대수")
    private String amenities_sink_num;
    @JsonProperty(value = "부대시설소화기수")
    private String amenities_fire_extinguisher_num;


    @JsonProperty(value = "주변시설낚시")
    private String surrounding_facilities_fishing;
    @JsonProperty(value = "주변시설산책로")
    private String surrounding_facilities_hiking_trail;
    @JsonProperty(value = "주변시설 물놀이(해수욕)")
    private String surrounding_facilities_water_play_cool;
    @JsonProperty(value = "주변시설 물놀이(수상레저)")
    private String surrounding_facilities_water_play_leisure;
    @JsonProperty(value = "주변시설물놀이(계곡)")
    private String surrounding_facilities_water_play_gorge;
    @JsonProperty(value = "주변시설물놀이(강)")
    private String surrounding_facilities_water_play_river;
    @JsonProperty(value = "주변시설물놀이(수영장)")
    private String surrounding_facilities_water_play_pool;
    @JsonProperty(value = "주변시설청소년체험시설")
    private String surrounding_facilities_youth_experience;
    @JsonProperty(value = "주변시설농어촌체험시설")
    private String surrounding_facilities_rural_experience;
    @JsonProperty(value = "주변시설어린이놀이시설")
    private String surrounding_facilities_children_playground;

    @JsonProperty(value = "글램핑침대")
    private String glamping_bed;
     @JsonProperty(value = "글램핑티비")
    private String glamping_tv;
     @JsonProperty(value = "글램핑냉장고")
    private String glamping_refrigerator;
     @JsonProperty(value = "글램핑유무선인터넷")
    private String glamping_wireless_internet;
     @JsonProperty(value = "글램핑내부화장실")
    private String glamping_internal_bathroom;
     @JsonProperty(value = "글램핑에어컨")
    private String glamping_airconditioner;
     @JsonProperty(value = "글램핑난방기구")
    private String glamping_heating_equipment;
     @JsonProperty(value = "글램핑취사도구")
    private String glamping_cooking_tools;

    @JsonProperty(value = "시설특징")
    private String facility_features;
    @JsonProperty(value = "시설소개")
    private String facility_introduction;
    @JsonProperty(value = "최종작성일")
    private String last_update_date;

}
