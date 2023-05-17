package myPackage;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class Date23_5_17 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4,1,5, 2, 1, 6};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

    private static void sort(int[] a, int i, int k) {
        int start = i;
        int end = k;
        int baseNumber = a[i];
        if (start >= end){
            return;
        }
        while (start != end) {          //3124
            if (a[end] > baseNumber) {
                end--;
                continue;
            }
            if (a[start] <= baseNumber) {
                start++;
                continue;
            }
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        int temp1 = a[i];
        a[i] = a[start];
        a[start] = temp1;
        sort(a, i, start - 1);
        sort(a, start + 1, k);
    }
}
//       String[] str = {"asd", "asda", "anfla","amsdmadslas","aa"};
        /*Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });*/
        /*Arrays.sort(str,(o1, o2)-> o1.length() - o2.length());
        System.out.println(Arrays.toString(str));*/
//        Girl g4 = new Girl("li", 11, 180);
//        Girl g3 = new Girl("awang", 10, 180);
//        Girl g2 = new Girl("bwu", 10, 180);
//        Girl g1 = new Girl("lei", 11, 190);
//        Girl[] g = {g1, g2, g3, g4};
//
//        System.out.println(Arrays.toString(g));
//        Arrays.sort(g, (o1, o2)->o1.getAge() - o2.getAge());
//        Arrays.sort(g, (o1, o2)-> {
//                int temp = o1.getAge()-o2.getAge();
//                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
//                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
//                if (temp > 0){
//                    return 1;
//                }else if (temp == 0){
//                    return 0;
//                }else if (temp < 0){
//                    return -1;
//                }
//                return 0;
//            }
//        );

        /* Arrays.sort(g, new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                int temp = o1.getAge()-o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0){
                    return 1;
                }else if (temp == 0){
                    return 0;
                }else if (temp < 0){
                    return -1;
                }
                return 0;
            }
        });*/
//        System.out.println(Arrays.toString(g));
    /*    System.out.println(get(12));
    }
    public static int get(int a){
        if (a == 1 || a == 2){
            return 1;
        }else{
            return get(a - 1) + get(a - 2);
        }
    }*/
//        int r = 1;
//        for (int i = 1; i < 3; i++) {
//            r = (r+1)*2;
//        }
//        System.out.println(r);
//        System.out.println(qiu(1));
//        System.out.println(pa(20));
//    }
//    private static int pa(int a){
//        if (a == 1){
//            return 1;
//        }else if (a == 2){
//            return 2;
//        }else if (a == 3){
//            return 4;
//        }
//        return pa(a-1) + pa(a - 2)+pa(a-3);
//    }


//    private static int qiu(int a){
//        if (a < 0 || a > 10){
//            System.out.println(-1);
//        }
//        if (a == 10)
//            return 1;
//        return (qiu(a+1)+1)*2;
//    }
//}
//class Girl{
//    private String name;
//    private int age;
//    private int height;
//
//    public Girl(){};
//    public Girl(String name, int age, int height) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    @Override
//    public String toString() {
//        return "Girl{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", height=" + height +
//                '}';
//    }
//}
