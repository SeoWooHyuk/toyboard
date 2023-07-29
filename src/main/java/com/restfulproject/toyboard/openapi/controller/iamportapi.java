package com.restfulproject.toyboard.openapi.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class iamportapi {


    @GetMapping("/tests")
    public String callApiWithJson() {
    StringBuffer result = new StringBuffer();
        String jsonPrintString = null;

        try {
            String apiUrl = "https://api.iamport.kr/payments/status/all?limit=20&sorting=-started&_token=1a939cbc648b14a933043118443da6f7d550aaf0";
        
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


        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonPrintString;
    }
}
