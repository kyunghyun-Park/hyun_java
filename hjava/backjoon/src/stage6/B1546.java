package stage6;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double[] dScore = new double[n];
        float average = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int max = score[0];

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }

        for(int i=0;i<score.length;i++){
            dScore[i] = (float)score[i]/max*100;
            System.out.println(dScore[i]);
            average+=dScore[i];
        }
        System.out.println(average/n);


    }
}
