package com.jf.apps.optionls;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 一个可以包含null值的容器对象
 */
public class OptionlDemo {


    public static void main(String[] args) {

        List<String> data = Arrays.asList("I","Love","You","too");
        Optional<String> first =  data.stream().distinct().findFirst();
        System.out.println(first.get());
        System.out.println(first.orElseGet(()->{return "123";}));


    }
}
