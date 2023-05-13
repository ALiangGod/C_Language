package myPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Date23_5_13 {
    public static void main(String[] args) {
//        double a = 0.1;
//        double b = 0.9;
//        System.out.println(0.1+0.9);
//        BigDecimal a = new BigDecimal("0.1");
//        BigDecimal bigDecimal = BigDecimal.valueOf(10);
//        BigDecimal add = bigDecimal.add(a);
//        System.out.println(bigDecimal.subtract(a));
//        System.out.println(bigDecimal.divide(a,2, RoundingMode.HALF_UP));
        String number = "15233867981";
        System.out.println(number.matches("1[3-9]\\d{9}"));
        String email = "3534926590@qq.com";
        System.out.println(email.matches("\\d{10}@\\w{2}.\\w{3}"));
        String a = "1010101010101X";
        System.out.println(a.matches("\\d{13}[0-9X]"));



    }

}
