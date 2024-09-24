public class functions_17 {

    public static void decimalToBinary(int decimalNum) {
        int myNum = decimalNum;
        int biNum = 0;
        int pow = 0;

        while (decimalNum > 0) {
            int remender = decimalNum % 2;
            biNum = biNum + remender * (int) Math.pow(10, pow);
            decimalNum /= 2;
            pow++;
        }
        System.out.println("Binary form of " + myNum + " is " + biNum);

    }

    public static void main(String[] args) {
        decimalToBinary(5);
    }
}
