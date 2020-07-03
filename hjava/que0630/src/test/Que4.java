package test;

public class Que4 {
    public static int hap(){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3!=0){
                sum+=i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(hap());
    }
}
