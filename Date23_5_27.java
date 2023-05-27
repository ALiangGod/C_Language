package myPackage;

import java.util.*;
import java.util.function.Consumer;

public class Date23_5_27 {
    public static void main(String[] args) {
        /*HashMap<String,Integer> a = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){

            String input = scanner.nextLine();
            if (input.equals("T"))
                break;
            Set<Map.Entry<String, Integer>> entries = a.entrySet();
            boolean key = false;
            for (Map.Entry<String, Integer> en : entries) {
                if (en.getKey().equals(input)){                 // a.containKey(name)
                    int i = en.getValue();
                    i++;
                    a.put(en.getKey(),i);
                    key = true;
                    break;
                }
            }
            if (!key) {
                a.put(input,1);
            }
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }

*/
//        Scanner sc = new Scanner(System.in);
//        Integer i  = (Integer) sc.nextLine();










        /*HashMap<stud,String> hm = new HashMap<>();
        stud zhang = new stud("zhang", 11);
        stud li = new stud("li", 12);
        stud wang = new stud("wang", 13);
        hm.put(zhang,"sb");
        hm.put(li,"zz");
        hm.put(wang,"rz");
        hm.put(wang,"r");
        Set<Map.Entry<stud, String>> entries = hm.entrySet();
        entries.forEach((studStringEntry) ->System.out.println(studStringEntry.getValue()));*/
        /*Set<stud> studs = hm.keySet();
        for (stud stud : studs) {
            System.out.println(hm.get(stud));
        }*//*
        Iterator<stud> iterator /= studs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
//        studs.forEach(stud->System.out.println(stud));

    }

}
class stud{
    public String name;
    public int age;

    public stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stud stud = (stud) o;
        return age == stud.age &&
                Objects.equals(name, stud.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "stud{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
