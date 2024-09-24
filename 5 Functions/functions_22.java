// Question 3: if number is palindrome or not?
// if the reverse of a number == originam number then there is a palindrome.
public class functions_22 {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remender = number % 10;
            reversedNumber = reversedNumber * 10 + remender;
            number /= 10;
        }

        if(originalNumber == reversedNumber){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}
