package stage8;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int num = Integer.parseInt(String.valueOf(ch));
            sum += num;
        }
        System.out.println(sum);

    }
}
