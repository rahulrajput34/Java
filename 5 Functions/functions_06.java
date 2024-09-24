// Question 2: Factorial

import java.util.*;
public class functions_06 {
    // n! = n(n-1)(n-2)...1     --> 3! == 3(3-1)(3-2) = 6  // that's why I take... i = 0 to n - 1 .
    public static int factorial(int n){
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            int fact = n - i;
            factorial *= fact;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int factorial = factorial(num);
        System.out.println(factorial);


    }
}
