package com.jf.apps.xstream;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * ouyangjie
 * 2020/1/16
 * 15:30
 */
public class testExplain {

    public static void main(String[] args) {
        try {
            String filePath= "D:\\dev\\aaaaaa.xml";
            InputStream inputStream = new FileInputStream(filePath);
            XStream xStream = new XStream();
            xStream.autodetectAnnotations(true);
            xStream.processAnnotations(CabinetRootConfig.class);
            CabinetRootConfig carInfos = (CabinetRootConfig) xStream.fromXML(inputStream);
            if(carInfos!=null){
                System.out.println(new Gson().toJson(carInfos));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
