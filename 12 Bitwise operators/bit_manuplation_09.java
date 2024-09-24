// Get ith bit
// 00010101
// 0    0   0   1   0   1  0   1
//7nth 6th 5th 4th 3rd 2nd 1st zeroth bit
public class bit_manuplation_09 {
    public static void getithBit(int number , int i){
        // if we want 2th bit it would make 0000100
        int bitMask = 1 << i;
        // and compare with the given number if number is 5 -- 0000101 & 0000100
        // then we get answer 1

        int getithBit = number & bitMask;
        if(getithBit == 1){
            System.out.println(" the " + i + "th bit is 1" );
        }else{
            System.out.println(" the " + i + "th bit is 0" );
        }
        

    }
    public static void main(String[] args) {
        getithBit(120, 0);
    }
}
