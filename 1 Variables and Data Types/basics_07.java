// Question 1:

import java.util.*;

public class basics_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A:");
        int a = sc.nextInt();
        
        System.out.println("Enter the number B:");
        int b = sc.nextInt();
        
        System.out.println("Enter the number C:");
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.println("the average of A,B,and C is: " + average);
    }
}
