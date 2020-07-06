package stage6;

import java.util.Scanner;

public class B3052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int namuji,cnt=0;
        int[] arr = new int[42];
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++)
            num[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            namuji = num[i]%42;
            arr[namuji]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
