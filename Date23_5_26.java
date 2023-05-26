package myPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Date23_5_26 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("w","a");
        m.put("e","d");
/*
        System.out.println(m.put("w", "b"));
        System.out.println(m.remove("w"));
        m.clear();
        System.out.println(m);*/
        Set<String> strings = m.keySet();
//        for (String string : strings) {
//            System.out.println(m.get(string));
//        }
        /*Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(m.get(next));
        }*/
//        strings.forEach(s->System.out.println(m.get(s)));

//        Set<Map.Entry<String, String>> entries = m.entrySet();
        Set<Map.Entry<String, String>> entries = m.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//        entries.forEach((stringStringEntry) ->System.out.println(stringStringEntry.getKey()+stringStringEntry.getValue()));
       /* Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }*/
       m.forEach((s, s2) ->System.out.println(s + "=" + s2));
    }
}
