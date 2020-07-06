package stage6;

import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        int[] cnt = new int[10];
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        String result = Integer.toString(a*b*c); //결과값 스트링에 넣음

        for(int i=0;i<result.length();i++) { //아스키코드비교해 배열 각 자리에 넣기
            char ch=result.charAt(i);
            cnt[ch-'0']++;
        }

        for(int i=0;i<cnt.length;i++)
            System.out.println(cnt[i]);
    }
}
