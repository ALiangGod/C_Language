package myPackage;

import java.util.Random;
import java.util.Scanner;

// 猜数字
public class Date23_4_19_SecDay {
    public static void main(String[] args) {
        Random r = new Random();
        int k = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i != k)
        {
            if (i > k)
                System.out.println("a little big");
            else
                System.out.println("kind of small");
            i = sc.nextInt();
        }
        System.out.println("equal");
    }
}
