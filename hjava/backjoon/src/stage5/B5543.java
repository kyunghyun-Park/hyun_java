package stage5;

import java.util.Scanner;

public class B5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] cost = new int[5];

        for(int i=0;i<cost.length;i++){
            cost[i]=sc.nextInt();
        }

        int burger = cost[0];
        int drink = cost[0];

        for(int i=0;i<3;i++){
            if(burger>cost[i])
                burger = cost[i];
        }
        for(int i=3;i<5;i++){
            if(drink>cost[i])
                drink = cost[i];
        }
        System.out.println(burger+drink-50);
    }
}
