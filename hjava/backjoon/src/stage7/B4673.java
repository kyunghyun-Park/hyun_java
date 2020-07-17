package stage7;

public class B4673 {
    public static void main(String[] args) {

        int[] arr = new int[10000];

        for (int n = 1; n < arr.length; n++) {
            if (d(n)>=10000)
                continue;

            arr[d(n)]=1;
        }

        for (int n = 1; n < arr.length; n++) {
            if (arr[n] == 0)
                System.out.println(n);
        }
    }

    public static int d(int n) {
        int x = n / 1000;
        int y = (n % 1000) / 100;
        int q = (n % 100) / 10;
        int w = n % 10;

        return n + x + y + q + w;
    }
}
