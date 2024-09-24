import java.util.*;

public class conditions_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age of person :");
        int age = sc.nextInt();
        // 1
        if ( age <= 18){
            System.out.println("you are not allwed to vote");
        }else{
            System.out.println("You are allowed to vote");
        }
        //2
        if( age <= 12){
            System.out.println("your are so cute");
        }else if (age > 12 && age <= 19){
            System.out.println("you are teenager");
        }else {
            System.out.println("you are mature");
        }
    
    }   
}
    
