// What happen in memory 
// function occupied a small memory. it occupied memory on call stake.
// in below code, it first occupied the memory main class and store its variable and then check what is called, if anything called then it wolud occupy the memory of calling stake and store its data type
// then calling code is finished then it destroed the memory of called function
// when its own code is ececuted then it destroyed the memory of its own function.
// this is what happen in call stack which we would learn from screach in reccusion class.

import java.util.*;

public class functions_03 {
    public static int sumOfTwoNum(int num1, int num2){
        int sum1 = num1 + num2;
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        
        int sum = sumOfTwoNum(a, b);
        System.out.println("Sum is " + sum);
    }
}

