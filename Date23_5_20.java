package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Date23_5_20 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add(1,"ccc");
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
//        l1.remove(1);
        l1.remove(Integer.valueOf(1));
        System.out.println(l1);
        String remove = list.remove(1);
        list.set(0,"qqq");
        System.out.println(list.get(0));
        System.out.println(list + remove);*/
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("cc");
        list.add("bb");
        list.add("ddd");

        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//            System.out.println(iterator.next());
//        }
//        for (String str:list){
//            System.out.println(str);
//        }
//        list.forEach(s->System.out.println(s));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()){
            String s = it.next();
            if ("bb".equals(s)){
                it.add("qqq");
            }
//            System.out.println(s);
        }
        while (it.hasPrevious()){
            String s = it.previous();
            System.out.println(s);
        }
    }

}
