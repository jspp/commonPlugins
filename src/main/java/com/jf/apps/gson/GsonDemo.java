package com.jf.apps.gson;

import com.google.gson.Gson;
import com.jf.apps.lambok.Userbean;
import lombok.extern.java.Log;

import java.util.Optional;

/**
 * Gson 示例
 */
@Log
public class GsonDemo {


    public static void main(String[] args) {

        Userbean userbean = new Userbean();
        userbean.setName("张三");
        userbean.setAge("123");
        Gson gson = new Gson();
        System.out.println( gson.toJson(userbean) );

        String jsonStr = "{\"name\":\"张三\",\"age\":\"123\"}";
        userbean = gson.fromJson(jsonStr,Userbean.class );
        Optional<Userbean> bean = Optional.of(userbean);
        System.out.println(bean.orElseGet(()->new Userbean()));


    }


}
