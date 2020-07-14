package stage7;

class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++)
            ans += a[i];
        return ans;
    }
}

public class B15596 {
    public static void main(String[] args) {
        Test t = new Test();
        int[] b={1,2,3,4};
        System.out.println(t.sum(b));

    }
}
