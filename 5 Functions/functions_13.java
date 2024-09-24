// Question 4: check if prime or not
public class functions_13 {
    public static boolean isPrime(int num) {
        boolean isprime = true;
        
        if(num == 2){
            isprime = false;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        
    }

}