// Question 2:
import java.util.*;

public class conditions_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a temprature of your body : ");
        double temp = sc.nextDouble();
        
        if (temp < 100){
            System.out.println("You not have fewer");
        } else{
            System.out.println("You have fewer in your body");
        }

    }
}
