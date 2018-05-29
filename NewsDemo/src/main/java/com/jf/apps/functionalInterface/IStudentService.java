package com.jf.apps.functionalInterface;

/**
 * 任何接口，如果只包含唯一 一个抽象方法，那么它就是一个FI
 * ---> 有且仅有一个抽象方法
 * 注意：
 *
 * 1、默认方法与静态方法并不影响函数式接口的契约，可以任意使用
 * 2、可以有 Object 中覆盖的方法，也就是 equals，toString，hashcode等方法。
 * 3、方便在 Lambda 表达式中使用
 *
 * 2018/5/29
 * 13:08
 */
@FunctionalInterface
public interface IStudentService<F,T> {

    T  showFunctionInterface(F msg);

}
