package com.alaric.java.week8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("apple", 12);
        map.put("pear", 8);
        map.put("banana", 24);
        System.out.println(map);
        //通过for循环遍历
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "单价为" + value);
        }
        //iterator遍历
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "单价为" + entry.getValue());
        }
        System.out.println("通过遍历Map的 entrySet，遍历 Key 和 Value，推荐使用！");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "单价为" + entry.getValue());
        }
        System.out.println("通过遍历 Map的 values，只能遍历 value，获取不到key");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("lambda表达式遍历，强烈推荐！！");
        map.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });
        //lambda遍历

    }
}
