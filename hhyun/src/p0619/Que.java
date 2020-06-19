package p0619;

import java.util.ArrayList;
import java.util.Scanner;

class Student2 {
    String name;
    String gender;
    int id;

    public Student2(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public void CheckInformation() {
        System.out.println("이름: " + name);
        System.out.println("성별: " + gender);
        System.out.println("학번: " + id);

    }
}

public class Que {
    public static void main(String[] args) {

        ArrayList<Student2> list = new ArrayList<Student2>();
        list.add(new Student2("이동준","남",123456));

        Student2 stu1 = new Student2("이동준", "남", 2009038033);
        Student2 stu2 = new Student2("안혜주", "여", 2020038011);
        Student2 stu3 = new Student2("고한솔", "남", 2015012011);
        Student2 stu4 = new Student2("안희령", "여", 2017011023);

        stu1.CheckInformation();
        System.out.println("-------------------------------");
        stu1.id = 2019038033;
        System.out.println(stu1.id);
        stu2.CheckInformation();
        System.out.println("-------------------------------");
        stu2 = null;

        Scanner sc = new Scanner(System.in);
        Student2 stu5 = new Student2(sc.nextLine(),sc.nextLine(),sc.nextInt());
        stu5.CheckInformation();

//        String name = sc.nextLine();
//        String gender = sc.nextLine();
//        int id = sc.nextInt();
        System.out.println("-------------------------------");



    }
}
