package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Date23_5_29 {
    public static void main(String[] args) {
//        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        /*ArrayList list = new ArrayList();
        Collections.addAll(list,1,23,4,5,6,1,2);
//        Collections.shuffle(list);
//        Collections.swap(list,1,3);
//        Collections.sort();
        System.out.println(list);*/
        ArrayList list = new ArrayList();
        Collections.addAll(list,"zhang","wang","li","wu","sb");
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));


    }
    public static int getSum(int...args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
