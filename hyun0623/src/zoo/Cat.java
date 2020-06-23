package zoo;

class Duck {
    private int numLeg = 2;

    public void md1() {
        System.out.println(numLeg);
        md2();
    }
    private void md2(){
        System.out.println(numLeg);
    }
    void md3(){
        System.out.println(numLeg);
        md2();

    }
}
public class Cat {
    public void makeSound() {
        System.out.println("야옹");
    }
    void makeHappy() {
        System.out.println("스마일~!~!~!~!~!~!~!~!~!~!~!~!");
    }
}
