package stage6;

import java.io.IOException;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min + " " + max);
    }
}
