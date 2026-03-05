package com;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamParallelProcessing {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 65, 6, 7, 8, 9, 10);
        //list.parallelStream().forEach(e->System.out.println(e));
        //list.stream().forEach(e->System.out.println(e));
//    List<Integer> evenNumbers=    list.parallelStream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//    System.out.println(evenNumbers);
//        int sum =
//                list.stream()
//                        .reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//        int maxNum = list.stream().max(Integer::compare).get();
//        System.out.println(maxNum);

       Map<Boolean, List<Integer>> mm = list.stream().collect(Collectors.partitioningBy(e->e>5));
        System.out.println(mm);

       // list.stream().filter().parallel().forEach(System.out::println);
    }
}
