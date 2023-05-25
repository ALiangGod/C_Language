package myPackage;

import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Date23_5_25 {
    public static void main(String[] args) {


        /*TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        System.out.println(ts.add(3));
        ts.add(1);
        ts.add(6);
        ts.add(2);
        System.out.println(ts);
        Iterator<Integer> iterator = ts.iterator();*/
        /*while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next );
        }*/

        /*for (Integer integer : ts) {
            System.out.println(integer);
        }*/
//        ts.forEach(integer-> System.out.println(integer));
//        TreeSet<stu4> treeSet = new TreeSet<>();
        stu4 zhan = new stu4("azhan", 11);
        stu4 zi = new stu4("zi", 12);
        stu4 wang = new stu4("wang", 13);
        TreeSet<stu4> treeSet = new TreeSet<>((o1, o2)-> {
                int i = o1.name.length() - o2.name.length();
                i = i==0 ? o1.name.compareTo(o2.name) : i;
                return i;
            });
        treeSet.add(zhan);
        treeSet.add(wang);
        treeSet.add(zi);
        for (stu4 stu4 : treeSet) {
            System.out.println(stu4);
        }
        /*treeSet.add(zhan);
        treeSet.add(wang);
        treeSet.add(zi);
        for (stu4 stu4 : treeSet) {
            System.out.println(stu4);
        }*/
    }
}
class stu4 implements Comparable<stu4>{
    public String name;
    public int age;

    public stu4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "stu4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(stu4 o) {
        int i = this.name.compareTo(o.name);
        return i;

    }
}