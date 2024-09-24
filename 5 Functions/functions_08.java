// Question 3: Find binomial coffecient
//  n! / r! (n - r)!

import java.util.*;

public class functions_08 {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binomialcoff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int binoCoff = n_fact / (r_fact * nmr_fact);

        return binoCoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of n  : ");
        int n = sc.nextInt();

        System.out.print("Enter a value of r : ");
        int r = sc.nextInt();

        int binoCoff = binomialcoff(n, r);
        System.out.println(binoCoff);

    }
}
