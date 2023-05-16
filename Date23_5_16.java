package myPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Date23_5_16 {
    public  static int pow(int a, int b){
        if (b == 1)
            return a;
        if (b == 0)
            return 1;
        while (b >= 2) {
            a = a * 10;
            b--;
        }
        return a;
    }
    public static void main(String[] args) {
      /*  int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sum <= 200){
            String str = sc.nextLine();
            int i = Integer.parseInt(str);
            if (i < 1 || i > 100){
                System.out.println("this number is so big or small");
                continue;
            }
            al.add(i);
            sum += i;
            System.out.println(al);
        }*/

        /*Scanner sc = new Scanner(System.in);
        while(true){
            int result = 0;
            String str = sc.nextLine();
            if (str.matches("[1-9]\\d{0,9}")){
                if (str.length() > 10 || str.length() < 1){
                    System.out.println("numeral too smaller or too bigger");
                    continue;
                }
                for (int i = str.length()-1; i >= 0; i--) {
                    result += ( str.charAt(i) -'0')* pow(10,(str.length()-i-1));
                    System.out.println(pow(10,(str.length()-i-1)));
                }
                System.out.println(result);
            }else{
                System.out.println("data exception");
            }
        }*/
        Scanner sc = new Scanner(System.in);
//        while(true){
//                String str = sc.nextLine();
//            Long number = Long.parseLong(str);
//            BigInteger number = new BigInteger(str);
//            StringBuilder sb = new StringBuilder();
//            2 10 0       2 4 0
//             2 5 1       2  2 0
//             2  2 0       2 1 1
//                1           0
//            while(new BigInteger(str).compareTo(new BigInteger("0")) >= 0){
////                long s = number%2;
////                number = number/2;
//                sb.append(new BigInteger(str).mod(new BigInteger("2")));
//                str = new BigInteger(str).divide(new BigInteger("2")).toString();
//                System.out.println(sb.reverse().toString());
//            }
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//
//        }
    }
    
}
