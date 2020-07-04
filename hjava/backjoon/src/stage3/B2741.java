package stage3;

import java.io.*;

public class B2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++)
            bw.write(i+"\n");
         //   System.out.println(i);

        bw.flush();
    }
}
