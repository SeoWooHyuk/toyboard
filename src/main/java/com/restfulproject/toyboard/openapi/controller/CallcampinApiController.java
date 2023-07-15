package com.restfulproject.toyboard.openapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
    
   @GetMapping("/jsonapi")
    public String callApiWithJson() {
        StringBuffer result = new StringBuffer();
        String jsonPrintString = null;
       
        try {
            String apiUrl = "https://api.odcloud.kr/api/15111395/v1/uddi:8c528230-eda4-4d83-855a-bee73605e49f?"+
            "page=1"+
            "&perPage=1"+
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
            for (OpenApiCamping camping : dataList) {
                
            }


            //만든거 다시 자바객체로 뱐환
            ObjectMapper objectMapper2 = new ObjectMapper();
            String jsonString = objectMapper2.writeValueAsString(param.getData());
            System.out.println(jsonString);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonPrintString;
    }
}
