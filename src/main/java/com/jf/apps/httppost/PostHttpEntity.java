package com.jf.apps.httppost;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * ouyangjie
 * 2020/3/26
 * 17:54
 */
public class PostHttpEntity {

    public static void main(String[] args) {

        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("appid",1060);
        paramMap.add("token","a9583115501c68ed257752798bacfbf0");
        paramMap.add("username","x_1585206099xd71");
        paramMap.add("sign","baf3f4e2dff8a3b24207dac02f444907");
        paramMap.add("certification","1");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json");
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);
        ResponseEntity<String> rsStr = new RestTemplate().postForEntity("http://localhost:8888/str", httpEntity, String.class);
        System.out.println(rsStr.getBody());


    }
}
