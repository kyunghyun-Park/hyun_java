package animal;

import zoo.Cat;

public class Dog {
    public void welcome(Cat c){
        c.makeSound();

        //c.makeHappy();        default는 같은 패키지 내에서만
    }
}
