package test2;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] hangul = new char[]{
                'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ',
                'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ', 'ㅏ', 'ㅑ', 'ㅓ', 'ㅕ', 'ㅗ', 'ㅛ', 'ㅜ',
                'ㅠ', 'ㅡ', 'ㅣ'};

        System.out.println((int)str.charAt(0));
        for (int i = 0; i < str.length(); i++)
            System.out.print(hangul[str.charAt(i) - (int) 'a']);

    }
}
