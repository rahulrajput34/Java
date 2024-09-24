// Question - Check if string is palindrome
public class string_05 {
    public static boolean isPalindrome(String rk){
        for (int i = 0; i < rk.length()/2; i++) {
            if (rk.charAt(i) != rk.charAt((rk.length() - 1) - i )){
                return false;
            } 
        }
        return true; 

    }
    public static void main(String[] args) {
        String rk = "noon";
        System.out.println(isPalindrome(rk));

    }
}
