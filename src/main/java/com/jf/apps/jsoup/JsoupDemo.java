package com.jf.apps.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * sun
 * 2018/6/9
 * 14:26
 */
public class JsoupDemo {

  public static void main(String[] args) throws IOException {
      String url = "http://baidu.com/";
      Document doc = Jsoup.connect(url).get();
      System.out.println(doc.getElementById("lg"));
  }

}
