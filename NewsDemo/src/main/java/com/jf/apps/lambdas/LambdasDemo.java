package com.jf.apps.lambdas;

/**
 *  语法结构：参数，名称随意->方法体
 *
 *     1.  有多个语句,可以用{} 包括, 如果需要返回值且只有一个语句,可以省略 return
 *     2. 访问控制:可以访问类的成员变量和局部变量(非final会自动隐含转为final)
 *
 *      参数名称是可以随意起的，但是有一定的要求，那就是必须与接口Message定义的print方法的参数类型一致，
 *      但是此处是可以进行声明也可以不声明，追求完美度高的用户可以进行声明。
 *
 *      ->: 是一个固定的写法，表示的方法指向方法体
 *
 *    注意事项：
 *       在使用lambda表达式的时候有一个最为重要的定义要求，那就是接口里面的方法只能存在一个。
 *       使用lambda表达式为了直接能够找到对应的方法，只能是定义一个。
 *
 *  1、  lambda表达式最重要的目的是解决匿名内部类的问题；
 *  2、  想要使用lambda表达式，那么必须以接口为主，而且接口里面只能够定义一个抽象方法
 */
public class LambdasDemo {

     public static void main(String[] args) {

            Runnable runnable = ()->{
                System.out.println("Start test");
            };

            runnable.run();

     }

}
