package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<Object,String> mm = new HashMap<>();
        mm.put(2,"two");
        mm.put(1,"one");
        mm.put(1,"Hello");
       mm.put("A","B");
        mm.put(3,"three");
        System.out.println(mm);
    }
}
