package stage5;

import java.util.Scanner;

public class B2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * num - 1) - (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
