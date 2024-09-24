// prime in range
public class functions_15 {
    public static boolean isPrime(int num) {
        if (num == 2 || num == 4) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primeInRange(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        primeInRange(50);
    }
}
