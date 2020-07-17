package stage8;

import java.util.Scanner;

public class B2675_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            int cnt=sc.nextInt();
            String str=sc.next();

            for(int j=0;j<str.length();j++){
                for(int k=0;k<cnt;k++){
                    System.out.print(str.charAt(j));
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
