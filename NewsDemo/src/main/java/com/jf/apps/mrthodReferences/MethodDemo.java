package com.jf.apps.mrthodReferences;

import java.util.Arrays;
import java.util.List;

/**
 *
 诸如String::length的语法形式叫做方法引用（method references），这种语法用来替代某些特定形式Lambda表达式。
 如果Lambda表达式的全部内容就是调用一个已有的方法，那么可以用方法引用来替代Lambda表达式。方法引用可以细分为四类：

 引用静态方法
 ContainingClass::staticMethodName
 例子: String::valueOf，对应的Lambda：(s) -> String.valueOf(s)
 比较容易理解，和静态方法调用相比，只是把.换为::

 引用特定对象的实例方法
 containingObject::instanceMethodName
 例子: x::toString，对应的Lambda：() -> this.toString()
 与引用静态方法相比，都换为实例的而已

 引用特定类型的任意对象的实例方法
 ContainingType::methodName
 例子: String::toString，对应的Lambda：(s) -> s.toString()
 太难以理解了。难以理解的东西，也难以维护。建议还是不要用该种方法引用。
 实例方法要通过对象来调用，方法引用对应Lambda，Lambda的第一个参数会成为调用实例方法的对象。

 引用构造函数
 ClassName::new
 例子: String::new，对应的Lambda：() -> new String()
 构造函数本质上是静态方法，只是方法名字比较特殊。
 */
public class MethodDemo {

    static void  showInfo(String x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3,7,4,5);
        list.stream().map(String::valueOf).forEach(System.out::println);

    }

}
