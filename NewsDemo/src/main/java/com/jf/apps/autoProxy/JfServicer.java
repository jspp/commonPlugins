package com.jf.apps.autoProxy;

import java.lang.annotation.*;

/**
 * 主要生成代理类的注解
 * ouyangjie
 * 2019/1/12
 * 16:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface JfServicer {

    String[] value() default {};

    Class<?> superClass() default Void.class;
}
