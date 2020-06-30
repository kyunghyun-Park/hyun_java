package test;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 몇 월입니까? ex) 12월 ");
        String mon = sc.nextLine();

        switch (mon) {
            case "12월":
            case "1월":
            case "2월":
                System.out.println("겨울");
                break;
            case "3월":
            case "4월":
            case "5월":
                System.out.println("봄");
                break;
            case "6월":
            case "7월":
            case "8월":
                System.out.println("여름");
                break;
            case "9월":
            case "10월":
            case "11월":
                System.out.println("가을");
                break;

           /* if(mon.equals("12월") ||mon.equals("1월")||mon.equals("2월"))
                System.out.println("겨울");
            else if(mon.equals("3월")||mon.equals("4월")||mon.equals("5월"))
                System.out.println("봄");
            else if(mon.equals("6월")||mon.equals("7월")||mon.equals("8월"))
                System.out.println("여름");
            else if(mon.equals("9월")||mon.equals("10월")||mon.equals("11월"))
                System.out.println("가을");*/
        }
    }
}
