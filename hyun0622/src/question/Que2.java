package question;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max,min;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print(i+1+"번째 정수 입력: ");
            arr[i] = sc.nextInt();
        }
        if(arr[0]>arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }

        for(int i=2;i<5;i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i=2;i<5;i++) {
            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("가장 큰 수: "+max +"가장 작은 수: "+min);



    }
}
