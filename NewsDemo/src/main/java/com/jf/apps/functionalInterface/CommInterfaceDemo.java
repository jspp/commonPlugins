package com.jf.apps.functionalInterface;

import java.util.function.*;

/**
 * 常用的函数式接口
 *  四种接口的实现采用的都是方法引用（Method References），也就是一个简单的方法调用而已，
 *  也是lambda表达式的一种简化写法。理解了这些再来理解下面说的lambda表达式的话，可能会更加好理解性。
 * sun
 * 2018/5/29
 * 15:01
 */
public class CommInterfaceDemo {

    public static void main(String[] args) {

        /**
         * Function<T, R> -T作为输入，返回的R作为输出
         */
        Function<String,String> function = (x) -> {System.out.println(x+": ");return "Function";};
        System.out.println(function.apply("hello world"));


        /**
         * Predicate<T> -T作为输入，返回的boolean值作为输出
         */
        Predicate<String> pre = (x) ->{System.out.println(x);return false;};
        System.out.println(": "+pre.test("hello World"));


        /**
         * Consumer<T> - T作为输入，执行某种动作但没有返回值
         */
        Consumer<String> con = (x) -> {System.out.println(x);};
        con.accept("hello world");


        /**
         * Supplier<T> - 没有任何输入，返回T
         */
        Supplier<String> supp = () -> {return "Supplier";};
        System.out.println(supp.get());

        /**
         * 自定义函数式接口
         */
        IStudentService studentService = (y)->{System.out.println(y);return y+"1";};
        //调用
        System.out.println(studentService.showFunctionInterface("张三"));


    }

}
