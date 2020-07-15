import java.util.Random;
import java.util.Scanner;

public class Rpc {
    static String getRandom() {
        Random random = new Random();
        String[] arr = {"보", "바위", "가위"};

        int randNum = random.nextInt(arr.length);

        return arr[randNum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String me = sc.nextLine();

        String b = getRandom();
        System.out.println(b);

        switch (me) {
            case "가위":
                if (b.equals("바위"))
                    System.out.println("졌음");
                else if (b.equals("보"))
                    System.out.println("이겼음");
                else System.out.println("비김");
                break;
            case "바위":
                if (b.equals("보"))
                    System.out.println("졌음");
                else if (b.equals("가위"))
                    System.out.println("이겼음");
                else System.out.println("비김");
                break;
            case "보":
                if (b.equals("가위"))
                    System.out.println("졌음");
                else if (b.equals("바위"))
                    System.out.println("이겼음");
                else System.out.println("비김");
                break;
        }

//        if (me.equals("가위")) {
//            if (b.equals("바위"))
//                System.out.println("졌음");
//            else if (b.equals("보"))
//                System.out.println("이겼음");
//            else System.out.println("비김");
//        } else if (me.equals("바위")) {
//            if (b.equals("보"))
//                System.out.println("졌음");
//            else if (b.equals("가위"))
//                System.out.println("이겼음");
//            else System.out.println("비김");
//        } else if (me.equals("보")) {
//            if (b.equals("가위"))
//                System.out.println("졌음");
//            else if (b.equals("바위"))
//                System.out.println("이겼음");
//            else System.out.println("비김");
//        }
    }
}
