package test2;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("태어난 년도? ");
        int year = sc.nextInt();

        switch (year%12){
            case 4:
                System.out.println("쥐띠");
                break;
            case 5:
                System.out.println("소띠");
                break;
            case 6:
                System.out.println("범띠");
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
        }
    }
}
