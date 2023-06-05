import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Date23_6_5 {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
//        RandomChoose("E:\\a\\name.txt");
//       Login();
//        ObjPassWord("E:\\a\\PassWord2.txt");        /
        /*Date23_6_5_Thread t1 = new Date23_6_5_Thread();
        Date23_6_5_Thread t2 = new Date23_6_5_Thread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();*/
        /*MyRun mr1 = new MyRun();
        MyRun mr2 = new MyRun();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();*/
        MyCallable mc = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(mc);
        Thread t1 = new Thread(futureTask);
        t1.start();
        Integer integer = futureTask.get();
        System.out.println(integer);
    }

    private static void ObjPassWord(String str) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(str));
        oos.writeObject("username=zhangsan&password=123&count=0");
        oos.close();
        return;
    }
    private static void ObjLogin() throws IOException{
        int count = 0;
        BufferedReader bw = new BufferedReader(new FileReader("E:\\a\\PassWord.txt"));
        String str = bw.readLine();
        String reallyName = str.split("&")[0].split("=")[1];
        String reallyPassWord = str.split("&")[1].split("=")[1];
        bw.close();
        int reallyCount = Integer.parseInt(str.split("&")[2].split("=")[1]);
        while (true) {
            if (count == 3)
                break;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名： ");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (name.equals(reallyName) && password.equals(reallyPassWord)) {
                count = 0;
                System.out.println("登陆成功");
                break;
            }
            System.out.printf("密码错误，剩余%d次机会\n", 2 - count);
            count++;
        }
    }
    private static void Login() throws IOException {
        int count = 0;
        BufferedReader bw = new BufferedReader(new FileReader("E:\\a\\PassWord.txt"));
        String str = bw.readLine();
        String reallyName = str.split("&")[0].split("=")[1];
        String reallyPassWord = str.split("&")[1].split("=")[1];
        bw.close();
        int reallyCount = Integer.parseInt(str.split("&")[2].split("=")[1]);
        while (true) {
            if (count == 3)
                break;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名： ");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (name.equals(reallyName) && password.equals(reallyPassWord)) {
                count = 0;
                System.out.println("登陆成功");
                break;
            }
            System.out.printf("密码错误，剩余%d次机会\n", 2 - count);
            count++;
        }
    }

    private static void RandomChoose(String str) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(str));
        ArrayList<Student> list = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null){
            String[] split = s.split("-");
            list.add(new Student(split[0], split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3])));
        }
        br.close();

        Double allWeight = 0.0;
        for (Student student : list) {
            allWeight += student.getWeight();
        }

        Double[] arr = new Double[list.size()];
        int index = 0;
        for (Student student : list) {
            arr[index] = student.getWeight() / allWeight;
            index++;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        double random = Math.random();
        int i = -Arrays.binarySearch(arr, random) - 1;
        list.get(i).setWeight(list.get(i).getWeight() / 2.0);
        System.out.println(list.get(i).toString());
        BufferedWriter bw = new BufferedWriter(new FileWriter(str));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }

}
class Student{
    private String name;
    private String gender;
    private int age;
    private double weight;

    public Student(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "-" + gender + "-" + age + "-" + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


class MyRun implements Runnable {


    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + "HelloWorld");
        }
    }
}
class MyCallable implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
