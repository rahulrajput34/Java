// Question 1:

import java.util.*;

public class conditions_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  number : ");
        int number = sc.nextInt();

        if (number < 0){
            System.out.println("The number is negative");
        } else{
            System.out.println("The number is positive");
        }
    }
}
