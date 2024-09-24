/**
 * Reverse the given number
 */
public class loops_08 {
    public static void main(String[] args) {
        int num = 123456789;
        while (num > 0 ) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
    }
    
}
