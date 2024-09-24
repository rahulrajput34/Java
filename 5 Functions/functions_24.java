public class functions_24 {
    public static int sumofDigits(int num){
        int number = num;
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofDigits(12345));
    }
}
