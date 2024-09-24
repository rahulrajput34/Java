import java.util.Scanner;

public class conditions_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number one: ");
        int num = sc.nextInt();
        

        if ( num % 2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }

    }
}
