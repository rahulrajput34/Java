// Question 3:

import java.util.*;

public class loops_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int onefactorial = 1;
        
        for (int i = 0; i < num; i++) {
            onefactorial *= num - i;
           
        }
        System.out.println(onefactorial);
    }
}
