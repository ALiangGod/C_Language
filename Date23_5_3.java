package myPackage;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Date23_5_3 {
    public static void main(String[] args) {
        Animal a = new cat1();
        a.eat();
    }
}
class Animal{
    private String name;
    private int age;

    public void eat(){
        System.out.println("eat");
    }
}
class cat1 extends Animal{
    public void eat(){
        System.out.println("cat eat");
    }
}
class dog1 extends Animal{
    public void eat(){
        System.out.println("dog eat");
    }
}