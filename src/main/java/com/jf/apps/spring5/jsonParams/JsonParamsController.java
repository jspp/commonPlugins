package com.jf.apps.spring5.jsonParams;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 接送参数
 * ouyangjie
 * 2020/3/23
 * 13:31
 */
@RestController
public class JsonParamsController {

    /**
     *  当做 字符串 参数  接送
     */
    @RequestMapping("/strJson")
    public String strJson(@RequestBody String val){
        System.out.println(" 收到的参数： "+ val);
        return  val;
    }

    /**
     *  接收多个对象
     */
    @RequestMapping("/bean")
    public String beanJson(Bean1 bean1,Bean2 bean2){
        System.out.println(" 收到的参数： "+ bean1.toString()+"     "+bean2.toString());
        return  bean1.toString()+"     "+bean2.toString();
    }




}
