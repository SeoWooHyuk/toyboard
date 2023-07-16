package com.restfulproject.toyboard.openapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.restfulproject.toyboard.openapi.dao.OpenApiCampingDao;
import com.restfulproject.toyboard.openapi.domain.OpenApiCamping;
import com.restfulproject.toyboard.openapi.dto.param.OpenApiCampingPram;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@RestController
public class CallcampinApiController  {
    

    private final OpenApiCampingDao dao;

   public CallcampinApiController(OpenApiCampingDao dao) {
        this.dao = dao;
    }


@GetMapping("/jsonapi")
    public String callApiWithJson() {
        StringBuffer result = new StringBuffer();
        String jsonPrintString = null;
       
        try {
            String apiUrl = "https://api.odcloud.kr/api/15111395/v1/uddi:8c528230-eda4-4d83-855a-bee73605e49f?"+
            "page=3"+
            "&perPage=1000"+
            "&serviceKey=NWl%2B%2Fgv9HNQV1IUv2zQ1ndFtKh49iUxJ4UFARogWEJbUeEDVFMn6uc33muj%2B0zFh%2BK5L4Kr7CUKJXGDquJXniA%3D%3D";
            URL url = new URL(apiUrl);
            
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));


            String returnLine;
            while((returnLine = bufferedReader.readLine()) != null) {
                result.append(returnLine);
            }
            jsonPrintString = result.toString();

            // Pattern pattern = Pattern.compile("\\s"); //json필드이름 공백제거
            // Matcher matcher = pattern.matcher(jsonPrintString);
            // String jsonpaten = matcher.replaceAll("");

          
            //자바 객체로 변환작업1
            // Gson gson = new GsonBuilder().create();
            // CreateCampingPram param = gson.fromJson(jsonpaten, CreateCampingPram.class); 

            //자바 객체로 변환작업2
            ObjectMapper objectMapper = new ObjectMapper();
            OpenApiCampingPram param = objectMapper.readValue(jsonPrintString,OpenApiCampingPram.class);
            System.out.println(param.getData());


            List<OpenApiCamping> dataList = param.getData();

            System.out.println(dataList.get(0).getLatitude());
            for (OpenApiCamping camping : dataList) {
                OpenApiCamping cam = new OpenApiCamping();
                cam.setFacility_name(camping.getFacility_name());
                cam.setCategory1(camping.getCategory1());
                cam.setCategory2(camping.getCategory2());
                cam.setCategory3(camping.getCategory3());
                cam.setSido_name(camping.getSido_name());
                cam.setSigungu_name(camping.getSigungu_name());
                cam.setEupmyeondong_name(camping.getEupmyeondong_name());
                cam.setRi_name(camping.getRi_name());
                cam.setBungi(camping.getBungi());
                cam.setRoad_name(camping.getRoad_name());
                cam.setBuilding_num(camping.getBuilding_num());
                cam.setLatitude(camping.getLatitude());
                cam.setLongitude(camping.getLongitude());
                cam.setZip_code(camping.getZip_code());
                cam.setRoad_address(camping.getRoad_address());
                cam.setJibun_address(camping.getJibun_address());
                cam.setPhone_num(camping.getPhone_num());
                cam.setWebsite(camping.getWebsite());
                cam.setBusiness_entity(camping.getBusiness_entity());
                cam.setWeekday_operating_hours(camping.getWeekday_operating_hours());
                cam.setWeekend_operating_hours(camping.getWeekend_operating_hours());
                cam.setSpring_operating_hours(camping.getSpring_operating_hours());
                cam.setSummer_operating_hours(camping.getSummer_operating_hours());
                cam.setFall_operating_hours(camping.getFall_operating_hours());
                cam.setWinter_operating_hours(camping.getWinter_operating_hours());
                cam.setAmenities_electricity(camping.getAmenities_electricity());
                cam.setAmenities_hot_water(camping.getAmenities_hot_water());
                cam.setAmenities_wifi(camping.getAmenities_wifi());
                cam.setAmenities_firewood_sales(camping.getAmenities_firewood_sales());
                cam.setAmenities_hiking_trail(camping.getAmenities_hiking_trail());
                cam.setAmenities_water_playground(camping.getAmenities_water_playground());
                cam.setAmenities_playground(camping.getAmenities_playground());
                cam.setAmenities_mart(camping.getAmenities_mart());
                cam.setAmenities_restroom_num(camping.getAmenities_restroom_num());
                cam.setAmenities_shower_room_num(camping.getAmenities_shower_room_num());
                cam.setAmenities_sink_num(camping.getAmenities_sink_num());
                cam.setAmenities_fire_extinguisher_num(camping.getAmenities_fire_extinguisher_num());
                cam.setSurrounding_facilities_fishing(camping.getSurrounding_facilities_fishing());
                cam.setSurrounding_facilities_hiking_trail(camping.getSurrounding_facilities_hiking_trail());
                cam.setSurrounding_facilities_water_play_cool(camping.getSurrounding_facilities_water_play_cool());
                cam.setSurrounding_facilities_water_play_leisure(camping.getSurrounding_facilities_water_play_leisure());
                cam.setSurrounding_facilities_water_play_gorge(camping.getSurrounding_facilities_water_play_gorge());
                cam.setSurrounding_facilities_water_play_river(camping.getSurrounding_facilities_water_play_river());
                cam.setSurrounding_facilities_water_play_pool(camping.getSurrounding_facilities_water_play_pool());
                cam.setSurrounding_facilities_youth_experience(camping.getSurrounding_facilities_youth_experience());
                cam.setSurrounding_facilities_rural_experience(camping.getSurrounding_facilities_rural_experience());
                cam.setSurrounding_facilities_children_playground(camping.getSurrounding_facilities_children_playground());
                cam.setGlamping_bed(camping.getGlamping_bed());
                cam.setGlamping_tv(camping.getGlamping_tv());
                cam.setGlamping_refrigerator(camping.getGlamping_refrigerator());
                cam.setGlamping_wireless_internet(camping.getGlamping_wireless_internet());
                cam.setGlamping_internal_bathroom(camping.getGlamping_internal_bathroom());
                cam.setGlamping_airconditioner(camping.getGlamping_airconditioner());
                cam.setGlamping_heating_equipment(camping.getGlamping_heating_equipment());
                cam.setGlamping_cooking_tools(camping.getGlamping_cooking_tools());
                cam.setFacility_features(camping.getFacility_features());
                cam.setFacility_introduction(camping.getFacility_introduction());
                cam.setLast_update_date(camping.getLast_update_date());

                // dao.createOpenApi(cam);
            }


            //만든거 다시 자바객체로 뱐환
            ObjectMapper objectMapper2 = new ObjectMapper();
            String jsonString = objectMapper2.writeValueAsString(param.getData());
            // System.out.println(jsonString);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonPrintString;
    }
}
