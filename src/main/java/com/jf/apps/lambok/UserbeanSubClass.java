package com.jf.apps.lambok;

import lombok.Data;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * ouyangjie
 * 2019/1/15
 * 9:54
 */
@Data
public class UserbeanSubClass extends Userbean{

    private String subName;



    public static void main(String[] args) {

        try {
            UserbeanSubClass vo = new UserbeanSubClass();
            BeanUtils.setProperty(vo,"subName","张三");
            BeanUtils.setProperty(vo,"age","22");

            System.out.println(JSONObject.fromObject(vo));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}


