package myPackage;
import java.util.Random;
import java.util.Scanner;
public class Date23_4_21 {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int k = 0;
//        while(true)
//        {
//            if(k == 5)
//                return;
//            int i = randomValue();
//            int n = 1;
//            for(int j = 0; j < 5; j++)
//            {
//                if (i == arr[j])
//                {
//                    n = 0;
//                    break;
//                }
//            }
//            if (n == 1)
//            {
//                printValue(i);
//                arr[k] = i;
//                k++;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputNum(arr, n);
        encryption(arr);

    }
    public static void inputNum(int[] arr, int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }
    public static void encryption(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            arr[i] = (arr[i] + 5)%10;
        for(int i = 0, j = arr.length-1; i < arr.length; i++, j--)
        {
            if(j == i || j+1 == i)
                break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static int randomValue()
    {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        int k = r.nextInt(5);
        return arr[k];
    }
    public static void printValue(int k)
    {
        System.out.println(k+"RMB has been withdrawn!");
    }
}
