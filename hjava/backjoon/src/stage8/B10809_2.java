package stage8;

import java.util.Scanner;

public class B10809_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(word.indexOf(c) + " ");
        }
        input.close();
    }
}
