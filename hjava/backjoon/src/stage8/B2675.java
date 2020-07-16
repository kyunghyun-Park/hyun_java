package stage8;

import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split((" "));

        String[] arr2 = arr[1].split("");


        int cnt = Integer.parseInt(arr[0]);
        System.out.println(cnt);
        int c = 0;

        for (int i = 0; i <  arr2.length; i++) {
            for (int j = 0; j <cnt; j++) {
                System.out.print(arr2[c]);
            }
            c++;
        }


    }
}
