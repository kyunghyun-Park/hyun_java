package stage6;

import java.io.*;
import java.util.StringTokenizer;

public class B10818_Buffred {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        //Integer.parseInt 할때는 예외처리 해주는게 좋음.
        try {
            for (int i = 0; i < num; i++)
                arr[i] = Integer.parseInt(st.nextToken());
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }


        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
