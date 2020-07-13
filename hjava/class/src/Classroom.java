class Test {
    String subject;
    int point;

    void setPoint(String s, int p) {
        subject = s;
        point = p;
    }

    String getPoint() {
        return subject + ":" + point;
    }
}

class Student {
    int id;
    String name;
    int subnum;
    Test[] test;

    Student(int i,String n,int s) {
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j=0;j<s;j++)
            test[j] = new Test();
    }

    String getName() {
        return id+":"+name;
    }

    int getGrade(){
        int sum=0;
        for(int i=0;i<subnum;i++)
            sum += test[i].point;
        return sum;
    }

    int getGrade(int a){
        int base = 100 * subnum / a;
        int rank = getGrade() / base + 1;
        return (rank>a)?a:rank;
    }

    void printScore(){
        System.out.println(getName());
        for(int i=0;i<subnum;i++)
            System.out.println(test[i].getPoint()+" ");
        System.out.println("총점 "+getGrade());
        int rank = 5;
        System.out.println(rank + "단계 평가 "+getGrade(rank));
        System.out.println();
    }
}
public class Classroom {
    public static void main(String[] args) {
        Student kim = new Student(12,"김주현",3);
        kim.test[0].setPoint("국어",66);
        kim.test[1].setPoint("영어",83);
        kim.test[2].setPoint("수학",75);
        kim.printScore();

        Student lee = new Student(7,"이 진",3);
        lee.test[0].setPoint("국어",44);
        lee.test[1].setPoint("영어",32);
        lee.test[2].setPoint("수학",11);
        lee.printScore();
    }
}
