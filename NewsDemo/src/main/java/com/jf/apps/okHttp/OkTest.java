package com.jf.apps.okHttp;

import okhttp3.*;

import java.io.IOException;

/**
 * ouyangjie
 * 2018/10/19
 * 10:14
 */
public class OkTest {


    public static void main(String[] args) throws Exception {
        // get
        OkHttpClient client = new OkHttpClient();
       /* String url = "http://www.pipiwan.com";
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            System.out.println(response.body().string()) ;
        }
        */
        // post
        String url = "http://www.pipiwan.com";
        RequestBody formBody = new FormBody.Builder()
                .add("platform", "android")
                .add("name", "bug")
                .add("subject", "XXXXXXXXXXXXXXX")
                .build();

        Request request = new Request.Builder().url(url).post(formBody).build();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        if (response.isSuccessful()) {
            System.out.println(response.body().string()) ;
        }




    }
}
