// question 4:

import java.util.*;
public class loops_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(num + "X" + i + "=" + num*i );
        }
    }
}
