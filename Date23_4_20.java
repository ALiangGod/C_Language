package myPackage;

import java.util.Scanner;

public class Date23_4_20 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        double price = sc1.nextDouble();
        int month = sc2.nextInt();
        int type_ = sc3.nextInt();
        discount(price, month, type_);
    }
    public static void discount(double a, int b, int c){
        if (5 <= b && b <= 10){
            if (c == 0)
                System.out.println(a*0.9);
            else
                System.out.println(a*0.85);
        }
        else{
            if (c == 0)
                System.out.println(a*0.7);
            else
                System.out.println(a*0.65);
        }
    }
}
