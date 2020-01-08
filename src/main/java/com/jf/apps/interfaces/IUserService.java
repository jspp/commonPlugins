package com.jf.apps.interfaces;

/**
 * 接口相关特性示例
 * sun
 * 2018/5/29
 * 11:40
 */
public interface IUserService {

   String info = " static property ";

    /**
     *  静态方法
     */
    public  static void showStaticMethod() {
         System.out.println(" IUserService.showStaticMethod() 静态方法 "+info);
    }
    public  static void showStaticMethod2() {
        System.out.println(" IUserService.showStaticMethod() 静态方法 "+info);
    }

    /**
     *  默认方法
     */
    public  default void showDefaultMethod() {
        System.out.println(" IUserService.showDefaultMethod() 默认方法 "+info);
    }

    public  default void showDefaultMethod2() {
        System.out.println(" IUserService.showDefaultMethod2() 默认方法 "+info);
    }

}
