// make calculator
import java.util.*;

public class conditions_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number 1 : ");
            int a = sc.nextInt();
            
            System.out.print("enter the operation you want to perform : ");
            char operator = sc.next().charAt(0);
            
            System.out.print("Enter the number 2 : ");
            int b = sc.nextInt();
        
         switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
         
            default:
            System.out.println("Wrong operator");
                break;
         }
    }
}
