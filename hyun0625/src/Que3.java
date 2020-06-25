

public class Que3 {
        int n1;

        public Que3(int n1) {
            this.n1 = n1;
        }

        public static void swap(Que3 x, Que3 y) {
            int temp=x.n1;
            x.n1=y.n1;
            y.n1=temp;

        }

    public static void main(String[] args) {
        Que3 a=new Que3(10);
        Que3 b =new Que3(20);

        System.out.println("호출 전"+a.n1+b.n1);
        swap(a,b);
        System.out.println("호출 후"+a.n1+b.n1);

    }


}
