package stage7;

public class B4673 {
    static void selfnumber() {
        int n = 100;
        for (int i = 1; i <= 100; i++) {
            int b = i + (i / 10) + (i % 10);
            System.out.println(b);
            for(int j=b;j<=100;j++){
            }
        }

    }

    public static void main(String[] args) {
        selfnumber();

    }
}
