package com.restfulproject.toyboard.openapi.controller;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class CallcampinApiController {
    
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

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(jsonPrintString);

            JsonNode arrayNode = jsonNode.isArray() ? jsonNode : jsonNode.get("array");

        
            
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonPrintString;
    }
}
