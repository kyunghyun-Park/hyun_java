package stage4;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cycle = 0,num;
        int n = sc.nextInt();
        sc.close();
        int a = n; //초기값과 비교할 a

        while (true) { //26
            num = (n / 10) + (n % 10); //8
            n = (n % 10 * 10) + (num % 10); //6*10+8
            cycle++;
            if (a == n)
                break;
        }
        System.out.println(cycle);
    }
}