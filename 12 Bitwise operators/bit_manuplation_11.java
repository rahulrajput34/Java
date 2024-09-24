// clear ith bit
// make zero at the place of give 0
// 000001 << 2 then 000100 then ~000100 then 111011 then if number is 5 then 000101 & 111011 -- 000001 answer is become 1

public class bit_manuplation_11 {
    public static void clearithBit(int number, int i){
        //because we want to zero only one given position that is why we make give 1's complement of 1. 
        int bitMask = ~(1 << i);

        // so that we can get the value
        int clearedNumber  = number & bitMask;
        System.out.println(clearedNumber);
    }
    public static void main(String[] args) {
        clearithBit(5, 2);
    }
}
