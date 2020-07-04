package stage5;

import java.util.Scanner;

public class B10817_2 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A < B) { //b가 a보다 클 때
            if (B < C) { //a보다 b가 더 큰데 c보다는 작을때
                System.out.println(B);
            } else if (A < C) { //a보다 b가 더 큰데 c가 a보다 클때
                System.out.println(C);
            } else {
                System.out.println(A);
            }
        } else { //c가 a나 b보다 클때
            if (A < C) {
                System.out.println(A);
            } else if (C < B) {
                System.out.println(B);
            } else {
                System.out.println(C);
            }

        }
    }
}