class Hi {
    int a;
    int b;

    Hi() {
        System.out.println("기본 생성자");
        a = 2;
        b = 2;

    }

    public Hi(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Hi h1 = new Hi();
        System.out.println(h1.a);
        System.out.println(h1.b);

        System.out.println(h1.getA());

        System.out.println(h1.getB());

    }
}
