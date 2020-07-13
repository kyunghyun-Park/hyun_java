package stage6;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[a];


        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < a; i++) {
            int cnt = 0, result = 0, score = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') { //O일때
                    cnt++;
                    score = score + cnt;
                    //System.out.println("O임 " + "cnt:" + cnt + " score:" + score + " " + result);
                } else {
                    result += score;             //X일때
                    cnt = 0;
                    score =0;
                   // System.out.println("X임 " + "cnt:" + cnt + "score:" + score + " " + result);
                }
            }
            result += score;
            System.out.println(result);
        }

    }
}
