// Binary to decimal
public class functions_16 {

    public static void binaryTOdecimal(int binaryNum) {
        int myNum = binaryNum;
        int decNum = 0;
        int power = 0;

        while (binaryNum > 0) {
            int lastDig = binaryNum % 10;
            decNum = decNum + lastDig * (int) Math.pow(2, power);
            binaryNum /= 10;
            power++;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    public static void main(String[] args) {
        binaryTOdecimal(101);
    }
}
