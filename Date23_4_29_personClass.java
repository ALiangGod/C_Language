package myPackage;

public class Date23_4_29_personClass {
    private String name;
    private int age;
    public Date23_4_29_personClass(){}

    public Date23_4_29_personClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed(Date23_4_29_Class a, String something){
        if (a instanceof dog){
            dog d = (dog)a;
            System.out.println(getName() + " is feeding dog " + something);
            d.eat(something);
            d.lookhome();
        }
        else if (a instanceof cat){
            System.out.println(getName() + " is feeding cat " + something);
            cat d = (cat) a;
            d.eat(something);
            d.catchMouse();
        }else{
            System.out.println("is not cat and dog");
        }
    }
}
