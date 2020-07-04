import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Program {
    public void gugudan() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    public void callName(String name) {
        System.out.println(name);
    }

    public void time() {
        Date today = new Date();

        SimpleDateFormat time = new SimpleDateFormat("hh시mm분ss초");

        System.out.println("현재 시각은 " + time.format(today)+"입니다.");
    }

    public void ant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번째 수열까지 출력할래요? ");
        String start = "1";

        sc = new Scanner(System.in);
        int nth = sc.nextInt();

        for (int i = 0; i < nth; i++) {
            System.out.println((i + 1) + "번째: " + start);
            String end = "";     //누적값 혹은 뭔가 끊어주는 값
            char number = start.charAt(0);      //몇 개인지 구해야 하는 숫자
            int count = 0;       //가리키는 숫자의 개수
            for (int j = 0; j < start.length(); j++) {
                //가리키는 숫자랑 다른 숫자가 나오는 경우 ex) 1 2
                if (number != start.charAt(j)) {
                    end = end + number + count; //11
                    number = start.charAt(j);
                    count = 1;
                } else //같은 숫자일 경우 ex) 1 1
                {
                    count++;
                }
            }
            end = end + number + count; //11 12 1121
            start = end; //11 12
        }
    }
}


public class Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program p1 = new Program();
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        p1.callName(name);

        while (true) {
            System.out.println("\n1.구구단 (구구단)");
            System.out.println("2.현재 시간 구하기 (현재시간)");
            System.out.println("3.수열 (수열)");
            System.out.println("4.종료 (종료)");
            System.out.print("실행 할 단어 입력: ");
            String s = sc.nextLine();

            if (s.equals("종료"))
                break;

            switch (s) {
                case "구구단":
                    p1.gugudan();
                    break;
                case "현재시간":
                    p1.time();
                    break;
                case "수열":
                    p1.ant();
                    break;
                default:
                    System.out.println("현재 지원하지 않는 기능입니다.");
            }


        }
    }
}
