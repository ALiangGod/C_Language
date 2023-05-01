package myPackage;

import java.util.Scanner;

public class Date23_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loc = sc.next();
        String yuyue = sc.next();
        if (yuyue.equals("yes" )){
            System.out.println("welcome to " + loc);
        }else{
            System.out.println("go home now! **---o.o---**");
        }
    }
    /*go to beijing and not yuyue is so bad!*/
}
