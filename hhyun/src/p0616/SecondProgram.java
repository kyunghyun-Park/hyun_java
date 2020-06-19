package p0616;

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        
        if(month>=3 && month <=5)
            System.out.println("봄");
        else if(month>=6 && month <=9)
            System.out.println("여름");
        else if(month==10||month==11)
            System.out.println("가을");
        else if(month==12||month==1||month==2)
            System.out.println("겨울");
    }
}
