package test2;

import java.util.Scanner;

 class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String str = sc.nextLine();

        int[] cnt = new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            cnt[ch - 'a']++;
        }
        System.out.println("각 문자의 수");

        for(int i=0;i<cnt.length;i++){
            if(cnt[i]!=0)
                System.out.println((char)(97+i)+"는 "+cnt[i]+"글자입니다.");
        }
    }
}
