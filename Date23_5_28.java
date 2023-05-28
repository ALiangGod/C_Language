package myPackage;

import java.util.*;
import java.util.function.BiConsumer;

public class Date23_5_28 {
    public static void main(String[] args) {
       /* LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("a", 12);
        lhm.put("b",11);
        lhm.put("c",13);
        lhm.put("d",15);
        lhm.put("e",16);
        lhm.put("a",11);
        System.out.println(lhm);*/

        /*TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(6,"Yu");
        tm.put(1,"You");
        tm.put(3,"BingGan");
        tm.put(2,"DouFu");
        System.out.println(tm);*/

        /*TreeMap<Stude,Integer> treeMap = new TreeMap<>();
        Stude stude1 = new Stude("Wang",13);
        Stude stude2 = new Stude("Li",14);
        Stude stude3 = new Stude("Zhang",18);
        Stude stude4 = new Stude("A",14);
        treeMap.put(stude1,001);
        treeMap.put(stude2,002);
        treeMap.put(stude3,003);
        treeMap.put(stude4,004);
        Set<Map.Entry<Stude, Integer>> entries = treeMap.entrySet();
        for (Map.Entry<Stude, Integer> entry : entries) {
            System.out.println(entry.getKey().toString() + ":  " + entry.getValue());
        }*/

        String s = "aabacaabd";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (treeMap.containsKey(c)){
                int count = treeMap.get(c);
                count++;
                treeMap.put(c, count);
            }else{
                treeMap.put(c, 1);
            }
        }
        /*Set<Character> characters = treeMap.keySet();
        for (Character character : characters) {
            System.out.print(character + "(" + treeMap.get(character) + ")");
        }*/
        /*StringBuilder sb = new StringBuilder();
        treeMap.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);*/
      /*  StringJoiner stringJoiner = new StringJoiner(".","a","");
        stringJoiner.add("b");
        stringJoiner.add("b");
        stringJoiner.add("b");
        System.out.println(stringJoiner);*/

    }
}
class Stude implements Comparable<Stude>{
    public String name;
    public int age;

    public Stude(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stude{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Stude o) {
        // this 表示添加数
        // o 表示红黑树中已存在的数
        // this。age - o。age 负数 代表小于 存左  0代表相等 舍去 1代表大于 存you
        int i = this.age - o.age;
        i = i == 0 ? this.name.compareTo(o.name) : i;
        return i;

    }
}
