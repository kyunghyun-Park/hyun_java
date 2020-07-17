package stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");    //바로 띄어쓰기 기준 3과 abc를 각 arr[0] , arr[1] 에 넣음

            int cnt = Integer.parseInt(arr[0]);               //arr[0]을 숫자로 변환

            //String[] str = arr[1].split("");              //배열쓰는방법
            String str = arr[1];                             //abc를 통째로 넣고

            for (int j = 0; j < str.length(); j++) {           //글자 개수를
                for (int k = 0; k < cnt; k++) {                 //카운트만큼 돌림
                    // System.out.print(str[j]);            //배열쓰는방법
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }

    }
}
