import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        int[] cnt = new int[26];
        String name = "";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        /*name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            //각 문자열을 ch로 따옴
            char ch = name.charAt(i);
            //a(97)-a(97) = 0 이므로 cnt[0]자리에 ++
            cnt[ch - 'a']++;
        }
//        for(int i=0;i<26;i++)
//            System.out.print(" "+cnt[i]);

        System.out.println("\n각 문자의 수");

        for (int i = 0; i < 26; i++) {
            //각 자리에 1이 올라간 인덱스만 추출
            if (cnt[i] != 0)
                System.out.println((char) (97 + i) + ":" + cnt[i]);
        }*/

        //2번문제
        /*Arrays.fill(cnt, -1);

        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 97;
            if (cnt[index] == -1)
                cnt[index] = i;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != -1) {
                System.out.println((char) (97 + i) + "는" +
                        (cnt[i] + 1) + "번째에서 처음 등장합니다.");
            }
        }*/

        //3번문제
        char[] test = new char[]
                {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ',
                'ㅋ','ㅌ','ㅍ','ㅎ','ㅏ','ㅑ','ㅓ','ㅕ','ㅗ','ㅛ','ㅜ',
                'ㅠ','ㅡ','ㅣ'};

        for(int i=0;i<input.length();i++){
            System.out.print(test[input.charAt(i)-(int)'a']);
        }
    }
}
