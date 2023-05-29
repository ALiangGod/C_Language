package myPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Date23_5_29_InClass {
    public static void main(String[] args) {
        for (int i = 100; i < 10000; i++) {
            int num = getNum(i);

            int sum = getSum(i, num);

            if (sum == i)
                System.out.println(i);
        }

    }

    public static int getSum(int i, int num){
        int sum = 0;
        int n = 1;
        while (n <= num){
            int s = i/sqrt(10, n-1)%sqrt(10, 1);
            sum += sqrt(s, 3);
            n++;
        }
        return sum;
    }

    public static int sqrt(int num, int n){
        int initN = 0;
        int initNum = 1;
        for (; initN < n; initN++){
            initNum *= num;
        }
        return initNum;



        /*if (i == 0)
            return 1;
        if (i == 1)
            return 10;
        int n = 10;
        while (i > 1){
            n *= 10;
            i--;
        }
        return n;*/
    }





    public static int getNum(int i){
        int n = 1;
        while ((i /= 10) != 0){
            n++;
        }
        return n;
    }
}