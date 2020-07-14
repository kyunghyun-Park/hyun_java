package stage9;

import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0) { //5로 바로 떨어질 때
            System.out.println(n / 5);
            return;
        } else { //5로 나눴을때 나머지 1이상
            int count = n / 5;
            System.out.println("count: " +count);
            for (int i = count; i > 0; i--) { //11같은경우(5,3,3) 몫에서 하나씩 빼면서 3으로 나눠지는지 검사
                int temp = n - (i * 5);
                System.out.println("temp: "+temp);
                if (temp % 3 == 0) {
                    System.out.println(i + (temp / 3));
                    return;
                }
            }
        }
        if (n % 3 == 0) {
            System.out.println(n / 3);
        } else {
            System.out.println(-1);
        }
    }
}
