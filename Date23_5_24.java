package myPackage;

import java.util.*;

public class Date23_5_24 {
    public static void main(String[] args) {
        /*Set<String> str = new HashSet<>();
        boolean aaa = str.add("aaa");
        boolean aaa1 = str.add("aaa");
        str.add("bbb");
        System.out.println(aaa1 + "" +aaa);
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
*/
/*

        HashSet hashSet = new HashSet();
        boolean wang = hashSet.add(new student("wang", 11));
        boolean wang1 = hashSet.add(new student("wang", 11));
        System.out.println(wang +"  "+wang1);
*/
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        System.out.println(linkedHashSet.add(new student("zhan", 11)));
        System.out.println(linkedHashSet.add(new student("zhan", 11)));
        System.out.println(linkedHashSet.add(new student("wang", 12)));
        Iterator iterator = linkedHashSet.iterator();
//        while (iterator.hasNext(){
//            student s = new student();
//            s = iterator.next();
//            System.out.println(st);
//        }
        System.out.println(linkedHashSet);
    }
}
class student{
    private String name;
    private int age ;
    public student(){};
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}