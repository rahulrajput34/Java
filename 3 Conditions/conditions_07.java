// check if student is pass or fail
import java.util.*;

public class conditions_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        float marks = sc.nextFloat();

        String passOrFail = (marks < 60) ? "you are Fail" : "You are pass";
        System.out.println(passOrFail);

    }
}
