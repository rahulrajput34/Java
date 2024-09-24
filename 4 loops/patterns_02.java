// Question 2:
public class patterns_02 {
    public static void main(String[] args) {
        int n = 9;
        for (int  line = 1; line <= n; line++) {
            for (int star = 1;  star <= n - line + 1 ; star++) { // star = n -li + 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
