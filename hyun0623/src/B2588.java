import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        String B = in.next();

        in.close();

        System.out.println(A * (B.charAt(2)));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));

    }
}
 