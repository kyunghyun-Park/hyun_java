package stage5;

import java.util.Scanner;

public class B10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= 2 * n; i++) {
                //짝수 행
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    //홀수 번째
                    if (j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                //홀수 행
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}