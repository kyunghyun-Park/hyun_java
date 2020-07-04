package test2;

class Circle {
    double rad = 0;
    final double PI = 3.14;

    public void setRad(double rad) {
        this.rad = rad;
    }

    public Circle(double r) {
        setRad(r);
    }

    public double getArea() {
        if (rad > 0)
            return (rad * rad) * PI;
        else {
            System.out.println("반지름 값이 음수입니다.");
            return rad;
        }
    }
}

public class Que6 {
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println(c.getArea());
    }
}
