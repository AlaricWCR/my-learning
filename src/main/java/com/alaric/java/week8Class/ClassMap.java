package com.alaric.java.week8Class;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName ClassMap
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/16
 **/
public class ClassMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("老师", "课程");
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");
        map.put("Allen", "JDBC");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            if (key.equals("Lucy")) {
                entry.setValue("CoreJava");
            }
        }
        //方式一：用for集合
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("老师：" + entry.getKey() + "课程：");
        }
        //方式二：用增强for循环
        Set<String> set = map.keySet();
        for (String str : set) {
            String string = map.get(str);
            System.out.println("老师：" + str + "课程：" + string);
        }
        //方式三：使用迭代器来遍历键的集合
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = (String) map.get(key);
            System.out.println(key + "=" + value);
        }
        //输出所有教PHP的老师；
        for (Map.Entry<String, String> entry : entrySet) {
            if (entry.getValue().equals("JDBC")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
