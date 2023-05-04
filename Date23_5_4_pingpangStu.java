package myPackage;

public class Date23_5_4_pingpangStu extends Date23_5_4_Stu implements Date_23_5_4_SpeckEngilsh{
    public Date23_5_4_pingpangStu() {
    }

    public Date23_5_4_pingpangStu(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("pingstu study");
    }

    @Override
    public void speck(){
        System.out.println("pstu speck");
    }
}
