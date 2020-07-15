package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839_while2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int count = 0;

        while(N%5 != 0 && N > 0){
            N -= 3;
            count++;
            System.out.println("N="+N);
            System.out.println("count="+count);
        }

        if(N<0)
            System.out.println(-1);
        else
            System.out.println(count + N/5);
    }
}
