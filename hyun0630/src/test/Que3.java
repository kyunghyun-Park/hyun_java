package test;
class Student{
    String name;
    int num;
    String gender;

    public Student() {
    }

    public Student(String name, int num,String gender) {
        this.name = name;
        this.num = num;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "이름 : " + name +
                ", 학번 : " + num +
                ", 성별 : " + gender;
    }
}
public class Que3 {
    public static void main(String[] args) {
        Student st = new Student("이동준",2009038033,"남");
        System.out.println(st.toString());

    }
}
