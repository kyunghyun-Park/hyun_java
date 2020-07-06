package stage6;

import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int count=0;

        int a = num.length;

        for (int i = 0; i < a; i++) //바로 나머지값 넣음
            num[i] = sc.nextInt()%42;

        for(int i=0;i<a;i++){
            int cnt=0;
            for(int j=i+1;j<10;j++){
                if(num[i]==num[j]){ //같은 값 찾기
                    cnt++;
                }
            }
            if(cnt==0)              //같은 값 없을때만 카운트++
                count++;

        }
        System.out.println(count);
    }
}
