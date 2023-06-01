package myPackage;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Date23_5_30 {
    public static void main(String[] args) {
/*
        List<String> a = List.of("a", "b", "c");
//        a.add("a");
        System.out.println(a);*//*
        Set<String> a = Set.of("a", "b", "c");
//        a.remove("a");
        for (String s : a) {
            System.out.println(s);
        }*/
        //        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("c");
//        arrayList
//        Arrays.copyOf()


        /*Map<String, Integer> z = Map.of("z", 1, "wang", 2, "san", 3);
        z.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+" = "+integer);
            }
        });*/
        /*HashMap<String, Integer> m = new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        m.put("d",4);
        *//*Set<Map.Entry<String, Integer>> entries = m.entrySet();
        Map map = Map.ofEntries(entries.toArray(new Map.Entry[0]));
        System.out.println(map);*//*
//        Map map = Map.ofEntries(m.entrySet().toArray(new Map.Entry[0]));
//        System.out.println(map);
        Map<String, Integer> stringIntegerMap = Map.copyOf(m);
//        stringIntegerMap.put("a",1);

        System.out.println(stringIntegerMap);*/
        /*List<String> list = new ArrayList<>();
        list.add("zhang");
        list.add("wang");
        list.add("wu");
        list.add("zhi");
        list.stream().filter(s->s.startsWith("z")).filter(s->s.length()<=3).forEach(s-> System.out.println(s));*/

        ArrayList<String> list = new ArrayList<>();
        /*list.add("ab");
        list.add("abbb");
        list.add("abasd");
        list.add("cccab");
        list.add("cab");
        *//*
        Collections.addAll(list,"ab","aav","aaabbb","accccc","bbbb");
//        list.stream().filter(s->s.startsWith("a")).forEach(s-> System.out.println(s));

        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
/*
        Map<String,Integer> m = new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        m.put("d",4);
        m.put("e",5);
        Set<String> strings = m.keySet();*/
//        Stream<String> stream = strings.stream();
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        Set<Map.Entry<String, Integer>> entries = m.entrySet();
//        entries.stream().forEach(s-> System.out.println(s));
//          }

        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("==============");
        String[] str = {"aa","bb"};

        Arrays.stream(str).forEach(s-> System.out.println(s));
        System.out.println("==============");
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        System.out.println("==============");

        Stream.of("a","b","c").forEach(s-> System.out.println(s));
        System.out.println("==============");

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,"cccc");
        Collections.addAll(arrayList, "aa", "bb", "aaa", "bbb","bbb");

        arrayList.stream().filter(s -> s.startsWith("a")).limit(1).forEach(s -> System.out.println(s));
        arrayList.stream().filter(s -> s.startsWith("b")).skip(1).forEach(s -> System.out.println(s));
        arrayList.stream().distinct().forEach(s -> System.out.println(s));
        Stream.concat(arrayList.stream(),arrayList1.stream()).forEach(s-> System.out.println(s ));
        System.out.println("++++++++++++++++++++");
        ArrayList<String> a = new ArrayList<>();
        Collections.addAll(a,"zhang-4","li-5");
        a.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String s1 = split[1];
                int i = Integer.parseInt(s1);
                return i;
            }
        }).forEach(s-> System.out.println(s));
        long count = a.stream().map(s -> Integer.parseInt(s.split("-")[1])).count();
        System.out.println(count);
        System.out.println("++++++++++++++++++++");
        Object[] objects = a.stream().toArray();
        System.out.println(Arrays.toString(objects));
        String[] strings = a.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(strings));
        String[] strings1 = a.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings1));
    }

}
