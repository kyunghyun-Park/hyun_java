package p0616;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("원숭이띠");
                break;
            case 1:
                System.out.println("닭띠");
                break;
            case 2:
                System.out.println("개띠");
                break;
            case 3:
                System.out.println("돼지띠");
                break;
            case 4:
                System.out.println("쥐띠");
                break;
            case 5:
                System.out.println("소띠");
                break;
            case 6:
                System.out.println("호랑이띠");
                break;
            case 7:
                System.out.println("토끼띠");
                break;
            case 8:
                System.out.println("용띠");
                break;
            case 9:
                System.out.println("뱀띠");
                break;
            case 10:
                System.out.println("말띠");
                break;
            case 11:
                System.out.println("양띠");
                break;
        }
//        if (year % 12 == 0)
//            System.out.println("원숭이띠");
//        else if (year % 12 == 1)
//            System.out.println("닭띠");
//        else if (year % 12 == 2)
//            System.out.println("개띠");
//        else if (year % 12 == 3)
//            System.out.println("돼지띠");
//        else if (year % 12 == 4)
//            System.out.println("쥐띠");
//        else if (year % 12 == 5)
//            System.out.println("소띠");
//        else if (year % 12 == 6)
//            System.out.println("호랑이띠");
//        else if (year % 12 == 7)
//            System.out.println("토끼띠");
//        else if (year % 12 == 8)
//            System.out.println("용띠");
//        else if (year % 12 == 9)
//            System.out.println("뱀띠");
//        else if (year % 12 == 10)
//            System.out.println("말띠");
//        else if (year % 12 == 11)
//            System.out.println("양띠");

    }
}
