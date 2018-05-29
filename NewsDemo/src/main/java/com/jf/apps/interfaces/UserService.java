package com.jf.apps.interfaces;

/**
 * sun
 * 2018/5/29
 * 12:53
 */
public class UserService implements IUserService {


    @Override
    public void showDefaultMethod() {
        System.out.println(" UserService.showDefaultMethod() 子类覆盖默认方法 "+info);
    }

    public static void main(String[] args) {
        //直接调用接口中的静态方法
        IUserService.showStaticMethod();
        IUserService.showStaticMethod2();

        IUserService userService = new UserService();
        // 默认方法
        userService.showDefaultMethod();
        userService.showDefaultMethod2();

    }

}
