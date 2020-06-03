package haha;

class SinusCap {
        void sniTake( ) {
        System.out.println("콧물이 싹~납니다.");
    }
    void sneTake() {
        System.out.println("재채기가 멎습니다");
    }
    void snuTake() {
        System.out.println("코가 뻥 뚫립니다");
    }

    void take() {
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient2 {
    void takeSinus(SinusCap cap){
        cap.take();
    }
}
public class OneClassEncapsulation {
    public static void main(String[] args) {
//        ColdPatient2 suf=new ColdPatient2();
//        suf.takeSinus(new SinusCap());
        SinusCap suf=new SinusCap();
        suf.take();
    }
}
