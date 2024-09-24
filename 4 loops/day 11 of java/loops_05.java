import java.util.*;
public class loops_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int index = 0; index <= num; index++) {
            sum+=index;
        }
        
        System.out.println("The Sum of 0 to " + num + " is " +sum);
    }
}
