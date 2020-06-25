import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        int num, min, sec;
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");
        num = sc.nextInt();

        min = num / 60;
        sec = num % 60;
        System.out.println(min+"분"+sec+"초");
    }
}
