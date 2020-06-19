package p0619;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    public int add(int amount){
        id+=amount;
        return id;
    }
    public void check(){
        System.out.println("id:" + id);
    }
}
public class ArrayClass {
    public static void main(String[] args) {
        //클래스
        Student stu1=new Student();
        stu1.id = 222;
        stu1.name="박경현";

        stu1.add(111);
        stu1.check();

        //배열
        int[] numberArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numberArray[i] = i + 1;
            System.out.println(numberArray[i] + " ");
        }
        //ArrayList
        ArrayList<String> t =
                new ArrayList<String>();
        ArrayList<Integer> i =
                new ArrayList<Integer>();
        i.add(2);
        t.add("안녕?");

        System.out.println(i.get(0));
        System.out.println(t.get(0));
        System.out.println(t.size());
        System.out.println(t.contains("안녕?"));
        Scanner sc = new Scanner(System.in);
        String con = "박경현이다";
        System.out.println(con.contains("박경현"));
        //인덱스 값 참조
        t.remove(0);

        //class
    }
}
