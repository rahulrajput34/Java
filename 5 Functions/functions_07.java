
// Question 2: another method
import java.util.*;

public class functions_07 {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
            // becase 3! is 3*2*1
            // becase 5! is 5*4*3*2*1
            // becase 4! is 4*3*2*1 // that is why it is logical to put f=f*i
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int factorial = factorial(num);
        System.out.println(factorial);

    }
}
