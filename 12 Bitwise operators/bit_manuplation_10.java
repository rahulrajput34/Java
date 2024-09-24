// set ith bit
// means write 1 at the given bit
public class bit_manuplation_10 {
    public static void setithBit(int number, int i){
        // if we want 2th bit it would make 0000100
        int bitMask = 1 << i;
        //and or with the given number if number is 5 -- 0000101 | 0000010
        // then we get answer 7
        int newNumber = number | bitMask;
        System.out.println(newNumber);

    }
    public static void main(String[] args) {
        setithBit(5, 1);
    }
}
