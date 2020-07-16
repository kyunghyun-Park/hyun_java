package stage8;

import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //버퍼비우기

        String[] x = new String[n];
        String[] arr = new String[n*2];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLine(); //3 ABC,5 /HTP
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



//        String[] arr2 = arr[1].split("");
//
//
//        int cnt = Integer.parseInt(arr[0]);
//        System.out.println(cnt);
//        int c = 0;
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < cnt; j++) {
//                System.out.print(arr2[c]);
//            }
//            c++;
//        }


    }
}
