public class Students {
    private String name;
    private int age;
    public int score;
    public Students(){}
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected Students(int age){
        this.age = age;
    }

    private Students(String name) {
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void eat(){
        System.out.println("chi");
    }private String eat(String str){
        System.out.println("chi");
        return "aoligei";
    }
    public void skip(){
        System.out.println("Tiao");
    }
    public void study(){
        System.out.println("学生在学习");
    }
}
