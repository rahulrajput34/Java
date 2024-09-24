// First method
// Check if the number is prime or not...
import java.util.*;
public class loops_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("Number is a prime");
        }
    
        for (int i = 2; i <= (num - 1); i++) {
            
            if( num % i == 0){
                System.out.println("number is prime");
                break;

            } else{
                System.out.println("Number is not a prime");
                break;
            }
            
        }
        
    }
}
