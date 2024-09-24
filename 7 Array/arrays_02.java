// Basics of array
import java.util.*;
public class arrays_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100]; // we can store 100 elements(max)

        // length of array
        System.out.println(marks.length);

        System.out.print("Enter the marks of chemistry : ");
        marks[0] = sc.nextInt();  // input a number
    
        System.out.print("Enter the marks of phyasics  : ");
        marks[1] = sc.nextInt();

        System.out.print("Enter the marks of maths     : ");
        marks[2] = sc.nextInt();

        System.out.println("The marks of chemistry is : " + marks[0]);
        System.out.println("The marks of physics is : " + marks[1]);
        System.out.println("The marks of maths is : " + marks[2]);

        marks[2] = 99; //update a value
        System.out.println("THe updated marks of math is: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("the percentage is : " + percentage);
    }
}
