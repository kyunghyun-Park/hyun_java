package stage9;

import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;

        if (n % 5 > 0) { //5로 나누고 설탕이 남을때
            sum = n / 5; //sum에 몫 넣어놓음
            int a = n % 5;
            if (a % 3 == 0) { //남은 양이 3으로 떨어질 때
                sum += a / 3;
                System.out.println(sum);
            } else if (n % 3 == 0) { //바로 3으로 떨어질 때
                System.out.println(n / 3);
            } else {
                int b = n - 5;
                sum = 1;
                if (b % 3 == 0) {
                    sum += b / 3;
                    System.out.println(sum);
                } else
                    System.out.println(-1);
            }
        } else if (n % 5 == 0) { //5로 딱 떨어질 때
            System.out.println(n / 5);
        } else System.out.println(-1);


    }
}
