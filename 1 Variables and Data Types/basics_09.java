// Question 3:

import java.util.*;

public class basics_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the price of a pencil: ");
        int pencil = sc.nextInt();
        
        System.out.println("Enter the price of a pen: ");
        int pen = sc.nextInt();
        
        System.out.println("Enter the price of a eraser: ");
        int eraser = sc.nextInt();

        float total = (pencil + pen + eraser);
        float totalWithTax = (total + total*0.18f);
        System.out.println(total);
        System.out.println(totalWithTax);


        // swich important what if there is no break statement
        // switch (2) {
        //     case 1:
        //         System.out.println("1");
        //         break;
        //     case 2:
        //         System.out.println("2");
        //     case 3:
        //         System.out.println("3");
        //         break;
        //     case 4:
        //         System.out.println("3");
        //         break;
        //     case 5:
        //         System.out.println("3");
        //         break;
        //     default:
        //     System.out.println("sefrer");
        //         break;
        // }

        //there also a mutator method in the class
    }
}