package question;

import java.util.Scanner;

public class QueTeacher<i> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("1번 문제");
        System.out.println("몇 층?");
        int floor = 0;
        try {
            floor = sc.nextInt();
        } catch (Exception e) {
            System.out.println("실패!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행");
        }
        System.out.println(floor);

        for (int i = 0; i < floor; i++) {
            for (int j = floor; j >=i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*System.out.println("2번 문제");
        int max,min,compareValue;
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        for(int i=0;i<5;i++) {
            compareValue = sc.nextInt();
            if(compareValue>max)
                max = compareValue;
            if(compareValue<min)
                min = compareValue;
        }
        System.out.println(
                //"max: "+max+", min :"+ min
                String.format("max : %d, min: %d",max,min)

        );*/

        System.out.println("3번 문제");
        String start = "1";

        sc = new Scanner(System.in);
        int nth = sc.nextInt();
        sc.close();

        for (int i = 0; i < nth; i++)
        {
            System.out.println((i + 1) + "번째: " + start);
            String end = "";     //누적값 혹은 뭔가 끊어주는 값
            char number = start.charAt(0);      //몇 개인지 구해야 하는 숫자
            int count = 0;       //가리키는 숫자의 개수
            for (int j = 0; j < start.length(); j++)
            {
                //가리키는 숫자랑 다른 숫자가 나오는 경우 ex) 1 2
                if (number != start.charAt(j))
                {
                    end = end + number + count; //11
                    number = start.charAt(j);
                    count = 1;
                }
                else //같은 숫자일 경우 ex) 1 1
                {
                    count++;
                }
            }
            end = end + number + count; //11 12 1121
            start = end; //11 12
        }
    }


}
