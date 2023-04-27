package myPackage;

import java.util.Scanner;
import java.util.ArrayList;



public class Date23_4_27_SMS {
    private static ArrayList<Date23_4_27_SMS_Class> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System!");
        System.out.println(">>>>>Input 0 to exit the System!<<<<<<<<<<<<<");
        System.out.println(">>>>>Input 1 to add student imformation<<<<<<");
        System.out.println(">>>>>Input 2 to delete student imformation<<<");
        System.out.println(">>>>>Input 3 to alter student imformation<<<<");
        System.out.println(">>>>>Input 4 to view student imformation<<<<<");
        while(true)
        {
            System.out.println(">>>>>Input your Options(Exit 0, Add 1, del 2, alter  3, view 4)");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            switch (key){
                case 0:
                    System.out.println(">>>>>>>Exit successfully!<<<<<<");
                    return;
                case 1:
                    addStu();
                    break;
                case 2:
                    delStu();
                    break;
                case 3:
                    alterStu();
                    break;
                case 4:
                    check();
                    break;
                default:
                    System.out.println("Please Input Correct Option");
                    break;
            }
        }
    }

    public static void addStu()
    {
        System.out.println(">>>>>Enter the function of <Add student information>");
        while(true)
        {
            System.out.println(">>>>>Sequential Input name age sno address(Input '#' to exit)");
            StringBuilder on_of = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            on_of.append(sc.next());
            String temp = on_of.toString();
            if (temp.equals("#")) {
                System.out.println("Exit <Function> Successfully!");
                return;
            }
            Date23_4_27_SMS_Class stu = new Date23_4_27_SMS_Class();
            stu.setName(temp);
            stu.setAge(sc.nextInt());
            stu.setSno(sc.nextLong());
            stu.setAddress(sc.next());
            list.add(stu);
        }
    }

    public static void check(){
        while (true)
        {
            System.out.println(">>>>>Input 0 to exit function");
            System.out.println(">>>>>Input 1 to check All Students<<<<<<<<<");
            System.out.println(">>>>>Input 2 to check designated student<<<");
            Scanner sc = new Scanner(System.in);
            int key1 = sc.nextInt();
            switch (key1){
                case 1:
                    System.out.println("<Name>    <Age>    <Sno>     <Address>");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println(list.get(i).getName()+"  "+list.get(i).getAge()+"    "+list.get(i).getSno()+"    "+list.get(i).getAddress());
                    break;
                case 2:
                    System.out.println("Input student's name:");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.next();
                    boolean onof = true;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equals(name)) {
                            System.out.println("<Name>    <Age>    <Sno>     <Address>");
                            System.out.println(list.get(i).getName() + "  " + list.get(i).getAge() + "    " + list.get(i).getSno() + "    " + list.get(i).getAddress());
                            onof = false;
                            break;
                        }
                    }
                    if (onof)
                        System.out.println("Unable to find this student");
                    break;
                case 0:
                    System.out.println("Exit <Function> Successfully!");
                    return;
                default:
                    System.out.println("Please Input Correct Option");
                    break;
            }
        }
    }

    public static void delStu()
    {
        while(true)
        {
            System.out.println(">>>>>Enter function of delete student (Input 0 to exit)");
            System.out.println(">>>>>Input the name of delete student:)");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            if (name.equals("0"))
            {
                System.out.println("Exit Successfully");
                return;
            }
            boolean onof = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name)){
                    list.remove(i);
                    onof = false;
                    break;
                }
            }
            if (onof)
                System.out.println("Can't find this student");
        }
    }
    public static void alterStu()
    {
        while (true){
            System.out.println("Enter function of AlterStudent(Input 0 to exit)");
            System.out.println("Enter the information of being modified:");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            if (name.equals("0"))
                return;
            Date23_4_27_SMS_Class stu = new Date23_4_27_SMS_Class();
            stu.setName(name);
            stu.setAge(sc.nextInt());
            stu.setSno(sc.nextLong());
            stu.setAddress(sc.next());
            boolean onof = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name))
                {
                    list.get(i).setAge(stu.getAge());
                    list.get(i).setSno(stu.getSno());
                    list.get(i).setAddress(stu.getAddress());
                    onof = false;
                    break;
                }
            }
            if (onof)
                list.add(stu);
        }
    }
}
