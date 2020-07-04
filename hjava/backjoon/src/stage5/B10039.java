package stage5;

import java.util.Scanner;

public class B10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stu = new int[5];
        int average = 0;
        for (int i = 0; i < 5; i++) {
            stu[i] = sc.nextInt();
            if (stu[i] < 40)
                stu[i] = 40;
            average += stu[i];
        }
        average = average / 5;
        System.out.println(average);

    }
}
