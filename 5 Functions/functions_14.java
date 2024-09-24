// Optimized way to write prime or not prime
public class functions_14 {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(30));
    }
}
