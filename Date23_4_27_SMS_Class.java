package myPackage;

public class Date23_4_27_SMS_Class {
    private String name;
    private int age;
    private long sno;
    private String address;

    public Date23_4_27_SMS_Class(){};
    public Date23_4_27_SMS_Class(String name, int age, long sno, String address) {
        this.name = name;
        this.age = age;
        this.sno = sno;
        this.address = address;
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

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
