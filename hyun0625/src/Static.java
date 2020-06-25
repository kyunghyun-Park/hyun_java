class StaticTest{
    static int instNum=100;

    StaticTest() {
        instNum++;
        System.out.println("인스턴스 생성"+instNum);
    }
}
public class Static {
    public static void main(String[] args) {
        System.out.println(StaticTest.instNum);
        StaticTest st = new StaticTest();
        st.instNum++;
        System.out.println(st.instNum);
        StaticTest.instNum++;
        System.out.println(StaticTest.instNum);

    }
}
