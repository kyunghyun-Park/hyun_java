class Apple{
    @Override
    public String toString() {
        return "I'm an apple";
    }
}
class Orange {
    public String toString(){
        return "I'm an orange";
    }
}

class AppleBox{
    private Apple ap;

    public void set(Apple a){
        ap=a;
    }
    public Apple get(){
        return ap;
    }
}

class OrangeBox{
    private Orange or;
    public void set(Orange o){
        or=o;
    }
    public Orange get(){
        return or;
    }
}
public class Gene {
    public static void main(String[] args) {
        AppleBox aBox = new AppleBox();
        OrangeBox oBox = new OrangeBox();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple ap = aBox.get();
        Orange og=oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
