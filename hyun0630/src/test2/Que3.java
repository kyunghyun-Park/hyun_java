package test2;

class Student {
    String name;
    int num;
    String gender;

    public Student() {
    }

    public Student(String name, int num, String gender) {
        this.name = name;
        this.num = num;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "이름 : "+name+", 학번 : "+num+", 성별 : "+gender;
    }
}

public class Que3 {
    public static void main(String[] args) {
        Student s1 = new Student("이동준", 2009038033, "남");
        Student s2 = new Student("이제영", 2007012034, "여");

        Student[] sArr = new Student[2];
        sArr[0] = s1;
        sArr[1] = s2;

        s1.num=2019038033;

        for (Student student : sArr) System.out.println(student);
    }
}
