import java.util.Scanner;

public class B11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String str = String.format("Case #%d: %d + %d = %d", i, a, b, a + b);
            System.out.println(str);
        }
    }
}
