package stage8;

import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] asc = new int[26];

        String str = sc.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            asc[ch - 'A']++;
        }

        int maxIndex = 0;
        int max = 0;
        char result = '?';

        for (int i = 0; i < asc.length; i++) {  //최대값 찾기
            if (asc[i] > max) {
                max = asc[i];
                maxIndex = i;                   //최대인덱스값
                result = (char) (maxIndex + 'A'); //or (char)(i+'A);
            } else if (max == asc[i])
                result = '?';
        }
        System.out.println(result);
    }
}
