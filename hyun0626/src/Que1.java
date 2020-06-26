import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        int[] cnt = new int[26];
        String name = "";

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        for(int i=0;i<name.length();i++){
            //각 문자열을 ch로 따옴
            char ch = name.charAt(i);
            //a(97)-a(97) = 0 이므로 cnt[0]자리에 ++
            cnt[ch -'a']++;
        }
//        for(int i=0;i<26;i++)
//            System.out.print(" "+cnt[i]);

        System.out.println("\n각 문자의 수");

        for(int i=0;i<26;i++){
            //각 자리에 1이 올라간 인덱스만 추출
            if(cnt[i]!=0)
                System.out.println((char)(97+i)+":"+cnt[i]);
        }

    }
}
