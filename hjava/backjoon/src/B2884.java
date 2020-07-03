package backjoon;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();

        m=m-45;
        if(m<0){
            m+=60;
            h=h-1;
            if(h<0)
                h=23;
        }
        System.out.println(h + " " + m);

    /*  if(m<45) {
          m += 60;
          h--;
          if (h < 0) h = 23;
      }
        System.out.println(h + " " + (m-45));*/
    }
}
