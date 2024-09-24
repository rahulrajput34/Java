// Question 3:
public class patterns_03 {
    public static void main(String[] args) {
        int n = 4;
        
        for (int line = 1; line <= n; line++) {
            for (int numbers = 1; numbers <= line; numbers++) {
                System.out.print(numbers);
            }
            System.out.println();
        }
    }
}
