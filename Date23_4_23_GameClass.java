package myPackage;

public class Date23_4_23_GameClass {
    private String name;
    private int volume;

    public Date23_4_23_GameClass(){}

    public Date23_4_23_GameClass(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void attack(Date23_4_23_GameClass hero){
        hero.volume -= 20;
        System.out.println(this.name+" to "+hero.name+" cause 20 damage! The "+hero.name+"'s volume has "+hero.volume+" remaining!");
    }

}

