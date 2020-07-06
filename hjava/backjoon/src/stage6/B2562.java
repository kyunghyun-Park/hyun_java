package stage6;

import java.io.IOException;
import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max=arr[0],index=0;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
