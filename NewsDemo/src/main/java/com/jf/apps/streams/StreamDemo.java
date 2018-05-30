package com.jf.apps.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream主要是通过管道来操作数据
 * 获取一个数据源（source）→数据转换→执行操作获取想要的结果，每次转换原有 Stream 对象不改变，返回一个新的 Stream 对象
 *
 * Stream中的操作可以分为两大类：
 *   中间操作与结束操作，中间操作只是对操作进行了记录，只有结束操作才会触发实际的计算（即惰性求值），这也是Stream在迭代大集合时高效的原因之一。
 *
 *   中间操作又可以分为无状态（Stateless）操作与有状态（Stateful）操作，前者是指元素的处理不受之前元素的影响；
 *   后者是指该操作只有拿到所有元素之后才能继续下去。
 *
 *   结束操作又可以分为短路与非短路操作，这个应该很好理解，前者是指遇到某些符合条件的元素就可以得到最终结果；而后者是指必须处理所有元素才能得到最终结果。
 *
 * Stream操作分类
 * 中间操作(Intermediate operations)
 *   无状态(Stateless)	unordered() filter() map() mapToInt() mapToLong() mapToDouble() flatMap() flatMapToInt() flatMapToLong() flatMapToDouble() peek()
 *   有状态(Stateful)	distinct() sorted() sorted() limit() skip()
 * 结束操作(Terminal operations)
 *   非短路操作	forEach() forEachOrdered() toArray() reduce() collect() max() min() count()
 *   短路操作(short-circuiting)	anyMatch() allMatch() noneMatch() findFirst() findAny()
 */
public class StreamDemo {

        public static void main(String[] args) {

            List<String> data = new ArrayList<>();
            data.add("I");
            data.add("Love");
            data.add("You");
            data.add("Too");
            data.add("Too");
            /*System.out.println("void forEach(Consumer<? super E> action):");
            data.stream().forEach((X)->{System.out.print(X.toUpperCase()+" ");});

            System.out.println("Stream<T> filter(Predicate<? super T> predicate):");
            data.stream().filter(xx->xx.length()>1).forEach((X)->{System.out.print(X.toLowerCase()+" ");});

            System.out.println("Stream<T> distinct():");
            data.stream().distinct().forEach((X)->{System.out.print(X.toLowerCase()+" ");});

            System.out.println("Stream<T> sorted():");
            data.stream().sorted().forEach((X)->{System.out.print(X.toLowerCase()+" ");});*/

/*          System.out.println("Stream<T> sorted(Comparator<? super T> comparator):");
            data.stream()
                    .sorted((String x,String y)->x.length()-y.length())
                    .distinct()
                    .forEach((X)->{System.out.print(X.toLowerCase()+" ");});*/

            /**
             * Stream map
             * 函数原型为<R> Stream<R> map(Function<? super T,? extends R> mapper)，
             * 作用是返回一个对当前所有元素执行执行mapper之后的结果组成的Stream。
             * 直观的说，就是对每个元素按照某种操作进行转换，转换前后Stream中元素的个数不会改变，但元素的类型取决于转换之后的类型。
             */
            /*System.out.println("<R> Stream<R> map(Function<? super T,? extends R> mapper)，:");
            data.stream()
                    .mapToInt(X->X.length())
                    .forEach((X)->System.out.print(X+" "));*/

            /**
             * <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)，
             * 作用是对每个元素执行mapper指定的操作，并用所有mapper返回的Stream中的元素组成一个新的Stream作为最终返回结果。
             * 说起来太拗口，通俗的讲flatMap()的作用就相当于把原stream中的所有元素都"摊平"(拆分)之后组成的Stream，转换前后元素的个数和类型都可能会改变。
             */
/*
            List<String> list = Arrays.asList("beijing changcheng", "beijing gugong", "beijing tiantan","gugong tiananmen");
            // list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);
            list.stream().flatMap(item -> Arrays.stream(item.split(" "))).collect(Collectors.toList()).forEach(System.out::println);
*/

            // 将Stream转换成容器或Map
            Stream<String> stream = Stream.of("I", "love", "you", "too");
            List<String> list = stream.collect(Collectors.toList()); // (1)
            // Set<String> set = stream.collect(Collectors.toSet()); // (2)
            // Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length)); // (3)

        }


}
