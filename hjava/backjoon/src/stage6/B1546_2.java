package stage6;

import java.util.Scanner;

public class B1546_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int score = 0;
        double maxScore = 0;
        double newScore;
        double total = 0;

        int[] arrScore = new int[n];

        for (int i = 0; i < n; i++) {
            score = sc.nextInt();
            arrScore[i] = score; //배열에 값 넣기

            if (score > maxScore) //배열에 값 넣으면서 바로 최대값 찾기
                maxScore = score;
        }

        for(int i=0;i<n;i++){
            newScore = arrScore[i]/maxScore*100;
            total+=newScore;
        }
        System.out.println(total/n);
    }
}
