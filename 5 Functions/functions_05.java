// Questions 1: product of two number
import java.util.*;
public class functions_05 {
    public static int productOfTwoNum(int num1, int num2){
        int product = num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        System.out.println("Enter a number : ");
        int b = sc.nextInt();

        int product = productOfTwoNum(a, b);
        System.out.println(product);
    }
}
