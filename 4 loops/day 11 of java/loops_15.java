import java.util.*;
public class loops_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            
            if(num % 10 == 0){
                continue;
            }
            
            System.out.println("Number was : " + num);
        }
    }
}
