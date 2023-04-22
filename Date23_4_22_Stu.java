package myPackage;

public class DailyClass {
    private String name;
    private int age;
    private String id;

    public DailyClass(){}

    public DailyClass(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

}