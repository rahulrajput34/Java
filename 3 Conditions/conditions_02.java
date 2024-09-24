import java.util.*;

public class conditions_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number two: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Num 1 is the bigger than num2");
        }else{
            System.out.println("Num 1 is not bigger than num2");
        }

    }
}
