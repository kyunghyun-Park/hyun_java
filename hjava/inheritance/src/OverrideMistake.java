class ParentAdder {
    public int add(int a,int b){
        return a+b;
    }
}
class ChildAdder extends ParentAdder {

    //@Override <-어노테이션 : 컴파일 전에 오류 잡아줌
    //상위 클래스 add 오버라이딩 안됨 (매개변수 다름)
    public double add(double a,double b){
        System.out.println("덧셈을 진행합니다");
        return a+b;
    }
}
public class OverrideMistake {
    public static void main(String[] args) {

        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3,4));
    }
}
