// Second method
// Check if the number is prime or not...

import java.util.Scanner;

public class loops_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is prime");
        }else{
            System.out.println(" n is not a prime");
        }
    }
}
