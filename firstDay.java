package myPackage;

import java.util.Random;
import java.util.Scanner;

public class firstDay {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("HelloWorld"+num);
    }
}
