// parametres and argumnets
// formal parametres and actual paramters
import java.util.*;

public class functions_02 {
    public static int sumOfTwoNum(int num1, int num2){ //  paramters or formal paramertres
        int sum1 = num1 + num2;
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        
        int sum = sumOfTwoNum(a, b);  // arguments or actual parametres
        System.out.println("Sum is " + sum);
    }
}
