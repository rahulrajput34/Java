// Question 2

import java.util.*;

public class loops_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfOdd = 0;
        int sumOfEven = 0;
        
        while(true){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("The Entered Number is Even : " + num);
                sumOfEven += num;
                System.out.println("The sum of Even num is : " + sumOfEven);
            } else{
                System.out.println("The sum of Odd num is : " + num);
                sumOfOdd += num;
                System.out.println("the number of entered Odd num is" + sumOfOdd);
            }

        }

    }
}
