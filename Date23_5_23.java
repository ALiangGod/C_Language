package myPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Date_23_5_23 {
    public static void main(String[] args) {
        ArrayList<BoXCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TaiDiDog> list3 = new ArrayList<>();
        ArrayList<HaShiQiDog> list4 = new ArrayList<>();
        list1.add(new BoXCat("boxi",11));
        list4.add(new HaShiQiDog("hashiqi",14));
        keepPet(list1);
//        keepPet(list2);
//        keepPet(list3);
        keepPet(list4);
    }
    private static void keepPet(ArrayList<?extends Animal1> list){
        Iterator<? extends Animal1> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal1 next = iterator.next();
            next.eat();
        }
    }
}

abstract class Animal1 {
    public String name;
    public int age;

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}

class cat2 extends Animal1 {
    @Override
    public void eat(){
        System.out.println("one name is " + this.name + " is eating BingGan");
    }
    public cat2(String name, int age) {
        super(name, age);
    }
}
class BoXCat extends cat2 {
    public BoXCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("one name is " + this.name + " is eating BingGan");
    }
}
class LiHuaCat extends cat2 {
    public LiHuaCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("one name is " + this.name + " is eating fish");
    }
}

class dog2 extends Animal1 {
    @Override
    public void eat(){
        System.out.println("one name is " + this.name + " is eating GuTou");
    }
    public dog2(String name, int age) {
        super(name, age);
    }
}
class TaiDiDog extends dog2 {
    public TaiDiDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("one name is " + this.name + " is eating GuTou");
    }
}
class HaShiQiDog extends dog2 {
    public HaShiQiDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("one name is " + this.name + " is eating Shi");
    }
}