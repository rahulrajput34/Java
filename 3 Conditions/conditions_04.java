// Income tax calculator
import java.util.*;
public class conditions_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary per annum value : ");
        int value = sc.nextInt();
        System.out.println("Your income is : " + value + " per annum");

        //tax values for 13 and 15 percent tax
        float withTaxValue1 = value*0.10f;
        float withTaxValue2 = value*0.15f;

        if (value < 500000){
            System.out.println("there is not tax reqired from you");
        } else if ( 500000 <= value && value < 1000000){
            System.out.println("you have to pay 10% tax which is  "+ withTaxValue1);
        } else{
            System.out.println("you have to pay 15% tax which is  "+ withTaxValue2);
        }
        
        
    }
}
