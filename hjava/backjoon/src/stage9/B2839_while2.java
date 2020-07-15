package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839_while2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;

        while(n%5 != 0 && n > 0){
            n -= 3;
            count++;
            System.out.println("n="+n);
            System.out.println("count="+count);
        }

        if(n<0)
            System.out.println(-1);
        else
            System.out.println(count + n/5);
    }
}
