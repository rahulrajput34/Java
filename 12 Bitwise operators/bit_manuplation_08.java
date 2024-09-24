// Question - Check is the number is even or odd
// in binary
// when least significant bit is 0 that time number is EVEN
// when least significant bit is 1 that time number is ODD...

// 1 in binary is 0000001 that is why we and with any other binary number it is going to give us the least significant bit.
// for example 
// 5 == 000101 & 000001 gives a answer 1 so that five is a odd number as simple as it.
public class bit_manuplation_08 {
    public static void oddOrEven(int n) {
        // 1 in binary is 0000001
        int bitMask = 1;
        int oddOrEven = bitMask & n;
        if (oddOrEven == 1) {
            System.out.println("The given number is ODD");
        } else {
            System.out.println("The given number is Even");
        }
    }

    public static void main(String[] args) {
        oddOrEven(001010);
    }
}
