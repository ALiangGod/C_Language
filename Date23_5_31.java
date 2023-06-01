package myPackage;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Date23_5_31 {
    public static void main(String[] args) {
       /* ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "zhang-nan-12", "song-nan-12", "wu-nan-12", "wang-nv-12");
       */ /*List<String> collect = arrayList.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(collect);*/

        /*Map<String, Integer> map = arrayList.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s ->s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    */
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,4,2,5,6,1,3,0);
//        list.stream().filter(s -> s % 2 == 0 && s != 0).forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s % 2 != 0).forEach(s -> System.out.println(s));
        /*ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhang,23","wang,25","li,24");
        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0],  s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);*/

      /*  Actor zhang = new Actor("zhang", 11);
        Actor wang = new Actor("wang", 12);
        Actor li = new Actor("li", 14);
        Actor song = new Actor("song", 16);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "song,14","wu,15","li,14");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "zhang,11","wang,12");
        List<Actor> collect = Stream.concat(
                list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) > 14),
                list1.stream().limit(1)
        ).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(collect);*/
        /*Integer[] arr = {1,5,2,3,5,7};
        Arrays.sort(arr, (o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Date23_5_31::sub);
        System.out.println(Arrays.toString(arr));*/
        /*ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "1","2","3");*/
//        for (String s : arrayList) {
//            int i = Integer.parseInt(s);
//            System.out.println(i);
//        }
       /* arrayList.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s-> System.out.println(s));
        arrayList.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));*/
       /*ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"zhangawd","zhangadwa","zhang");
        arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("zhang")&&s.length()>5;
            }
        }).forEach(s -> System.out.println(s));
        arrayList.stream().filter(new Actor():: s).forEach(s -> System.out.println(s));
        arrayList.stream().filter(new Date23_5_31()::s).forEach(s -> System.out.println(s));*/

//       ArrayList<String> arrayList = new ArrayList<>();
//       Collections.addAll(arrayList, "zhang,11","wang,13");
        /*List<Actor> collect = arrayList.stream().map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                return new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList());
        System.out.println(collect);*/
//        List<Actor> collect = arrayList.stream().map(Actor::new).collect(Collectors.toList());
//        System.out.println(collect);
        /*ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"z","b","a");
        arrayList.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));
        arrayList.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));*/
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,2,3);
        Integer[] integers = arrayList.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        Integer[] objects = arrayList.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(objects));*/
        /*ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"zhang,12","wang,11");
        arrayList.stream().map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                return new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(s-> System.out.println(s));
        Actor[] actors = arrayList.stream().map(Actor::new).toArray(new IntFunction<Actor[]>() {
            @Override
            public Actor[] apply(int value) {
                return new Actor[value];
            }
        });
        System.out.println(Arrays.toString(actors));
        Actor[] actors1 = arrayList.stream().map(Actor::new).toArray(Actor[]::new);
        System.out.println(Arrays.toString(actors1));*/
        ArrayList<Actor> arrayList = new ArrayList<>();
        arrayList.add(new Actor("zhang",1));
        arrayList.add(new Actor("wu",2));
        arrayList.add(new Actor("wang",3));
        String[] strings = arrayList.stream().map(new Function<Actor, String>() {
            @Override
            public String apply(Actor actor) {
                return actor.name;
            }
        }).toArray(String[]::new);
        String[] strings1 = arrayList.stream().map(Actor::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(strings1));


    }
    private static int sub(int a, int b){
        return b - a;
    }
    public boolean s(String s){
        return s.startsWith("zhang")&&s.length() > 5;
    }
}
class Actor {
    public String name;
    public int age;
public Actor(){};
    public Actor(String str){
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
    }
    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean s(String s){
        return s.startsWith("zhang")&&s.length() > 5;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
