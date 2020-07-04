class Student {
    private String name;
    private int num;

    public Student() {
    }

    public Student(String name, int num, String gender) {
        this.name = name;
        this.num = num;
        this.gender = gender;
    }

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "이름:'" + name + '\'' +
                ", 학번:" + num +
                ", 성별:'" + gender + '\'' +
                "}\n";
    }
}

public class QueTeacher {
    public static void main(String[] args) {
        //ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("박경현", 23123, "여");
        Student s2 = new Student();
        s2.setName("박경현");
        s2.setGender("남");
        s2.setNum(444421);
        Student[] sArray = new Student[4];
        sArray[0]=s1;
        sArray[1]=s2;

        //students.add(s1);
       //students.add(s2);

        System.out.println(sArray[0]);
        System.out.println(sArray[1]);
        //System.out.println(Arrays.toString(students.toArray()));


    }

}
