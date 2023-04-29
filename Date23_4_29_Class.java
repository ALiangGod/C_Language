package myPackage;

public class Date23_4_29_Class {
    private String color;
    private int age;
    public void eat(String something){
        System.out.println("eat");
    }

    public Date23_4_29_Class(){}
    public Date23_4_29_Class(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class dog extends Date23_4_29_Class{
    public dog(String color, int age) {
        super(color, age);
    }

    public void eat(String something){
        System.out.println(getAge() + "and " + getColor() + "dog is eat " + something);
    }
    public void lookhome(){
        System.out.println("dog look home");
    }
}
class cat extends Date23_4_29_Class{
    public cat(String color, int age) {
        super(color, age);
    }

    public void eat(String something){
        System.out.println(getAge() + " and " + getColor() + "cat is eat " + something);
    }
    public void catchMouse(){
        System.out.println("cat catch mouse");
    }
}
