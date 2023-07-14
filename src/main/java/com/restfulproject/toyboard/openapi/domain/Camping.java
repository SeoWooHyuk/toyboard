package com.restfulproject.toyboard.openapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Camping {

    @JsonProperty(value = "시설명")
    private String facility_name;

    @JsonProperty(value = "카테고리1")
    private String category1;

    @JsonProperty(value = "카테고리2")
    private String category2;

    @JsonProperty(value = "카테고리3")
    private String category3;

    @JsonProperty(value = "시도 명칭")
    private String sido_name;
    @JsonProperty(value = "시군구 명칭")
    private String sigungu_name;
    @JsonProperty(value = "법정읍면동명칭")
    private String eupmyeondong_name;
    @JsonProperty(value = "리 명칭")
    private String ri_name;
    @JsonProperty(value = "번지 가변문자형")
    private String bungi;
    @JsonProperty(value = "도로명 이름")
    private String road_name;
    @JsonProperty(value = "건물 번호")
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
    @JsonProperty(value = "평일 운영 여부")
    private String weekday_operating_hours;
    @JsonProperty(value = "주말 운영 여부")
    private String weekend_operating_hours;
    @JsonProperty(value = "봄 운영 여부")
    private String spring_operating_hours;
    @JsonProperty(value = "여름 운영 여부")
    private String summer_operating_hours;
    @JsonProperty(value = "가을 운영 여부")
    private String fall_operating_hours;
    @JsonProperty(value = "겨울 운영 여부")
    private String winter_operating_hours;


    @JsonProperty(value = "부대 시설 전기")
    private String amenities_electricity;
    @JsonProperty(value = "부대 시설 온수")
    private String amenities_hot_water;
    @JsonProperty(value = "부대 시설 무선인터넷")
    private String amenities_wifi;
    @JsonProperty(value = "부대 시설 장작판매")
    private String amenities_firewood_sales;
    @JsonProperty(value = "부대 시설 산책로")
    private String amenities_hiking_trail;
    @JsonProperty(value = "부대 시설 물놀이장")
    private String amenities_water_playground;
    @JsonProperty(value = "부대 시설 놀이터")
    private String amenities_playground;
    @JsonProperty(value = "부대 시설 마트")
    private String amenities_mart;
    @JsonProperty(value = "부대 시설 화장실 수")
    private String amenities_restroom_num;
    @JsonProperty(value = "부대 시설 샤워실 수")
    private String amenities_shower_room_num;
    @JsonProperty(value = "부대 시설 씽크대 수")
    private String amenities_sink_num;
    @JsonProperty(value = "부대 시설 소화기 수")
    private String amenities_fire_extinguisher_num;


    @JsonProperty(value = "주변 시설 낚시")
    private String surrounding_facilities_fishing;
    @JsonProperty(value = "주변 시설 산책로")
    private String surrounding_facilities_hiking_trail;
    @JsonProperty(value = "주변 시설 물놀이(해수욕)")
    private String surrounding_facilities_water_play_cool;
    @JsonProperty(value = "주변 시설 물놀이(수상레저)")
    private String surrounding_facilities_water_play_leisure;
    @JsonProperty(value = "주변 시설 물놀이(계곡)")
    private String surrounding_facilities_water_play_gorge;
    @JsonProperty(value = "주변 시설 물놀이(강)")
    private String surrounding_facilities_water_play_river;
    @JsonProperty(value = "주변 시설 물놀이(수영장)")
    private String surrounding_facilities_water_play_pool;
    @JsonProperty(value = "주변 시설 청소년체험시설")
    private String surrounding_facilities_youth_experience;
    @JsonProperty(value = "주변 시설 농어촌체험시설")
    private String surrounding_facilities_rural_experience;
    @JsonProperty(value = "주변 시설 어린이놀이시설")
    private String surrounding_facilities_children_playground;

    @JsonProperty(value = "글램핑 침대")
    private String glamping_bed;
     @JsonProperty(value = "글램핑 티비")
    private String glamping_tv;
     @JsonProperty(value = "글램핑 냉장고")
    private String glamping_refrigerator;
     @JsonProperty(value = "글램핑 유무선인터넷")
    private String glamping_wireless_internet;
     @JsonProperty(value = "글램핑 내부화장실")
    private String glamping_internal_bathroom;
     @JsonProperty(value = "글램핑 에어컨")
    private String glamping_airconditioner;
     @JsonProperty(value = "글램핑 난방기구")
    private String glamping_heating_equipment;
     @JsonProperty(value = "글램핑 취사도구")
    private String glamping_cooking_tools;



    @JsonProperty(value = "시설 특징")
    private String facility_features;
    @JsonProperty(value = "시설 소개")
    private String facility_introduction;
    @JsonProperty(value = "최종 작성일")
    private String last_update_date;

    private String data;
    private int currentCount;
    private int matchCount;
    private int page;
    private int perPage;
    private int totalCount;

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
