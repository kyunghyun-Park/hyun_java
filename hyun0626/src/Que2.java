import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        String[] array = str.split("");
        String[] array2 = (array.clone());
        int len=array.length;
        int[] count = new int[len];

        for (int i = 0; i < array.length; ) {
            System.out.println("array.length = "+array.length);
            while(array[i].equals(array2[i])){

            }
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (array[i].equals(str.charAt(i))) {
//
//            }
//        }
    }
}
