package com.jf.apps.post;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * 测试通过
 * ouyangjie
 * 2020/3/26
 * 17:54
 */
public class PostObjectByEntity {

    public static void main(String[] args) {

        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("appid",1060);
        paramMap.add("token","a9583115501c68ed257752798bacfbf0");
        paramMap.add("username","x_1585206099xd71");
        paramMap.add("sign","baf3f4e2dff8a3b24207dac02f444907");
        paramMap.add("certification","1");

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);

        String rsStr = new RestTemplate().postForObject("http://sdkapi.277sy.com/index.php/User/check", httpEntity, String.class);
        System.out.println(rsStr);

    }
}
