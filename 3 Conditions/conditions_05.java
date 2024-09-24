// largest of three numbers

import java.util.*;

public class conditions_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thew number 1 :");
        int num1 = sc.nextInt();

        System.out.print("Enter thew number 2 :");
        int num2 = sc.nextInt();

        System.out.print("Enter thew number 3 :");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("the largest number is : " + num1);
        } else if ( num2 > num3){
            System.out.println("the largest number is: " + num2);
        } else{
            System.out.println("the largest number is : " + num3);
          }
        
    }
}
