package com.jf.apps.mrthodReferences;

import java.util.Arrays;
import java.util.List;

/**
 *
 诸如String::length的语法形式叫做方法引用（method references），这种语法用来替代某些特定形式Lambda表达式。
 如果Lambda表达式的全部内容就是调用一个已有的方法，那么可以用方法引用来替代Lambda表达式。方法引用可以细分为四类：

 方法引用类别	举例
 引用静态方法	    Integer::sum
 引用某个对象的方法	list::add
 引用某个类的方法	String::length
 引用构造方法   	HashMap::new
 我们会在后面的例子中使用方法引用。
 */
public class MethodDemo {

    static void  showInfo(String x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3,7,4,5);
        list.stream().forEach((X)->System.out.print(X));

    }

}
