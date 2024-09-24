// one's complement 
//  0  = 1
//  1  = 0

//important note:  
// ~0 = -1 because 0 menas 000000 and then repeat below process and become -1

// note == if most significant bit is 1 , number is negative
// if it is zero than the number is positive.

public class bit_manuplation_05 {
    public static void main(String[] args) {
        System.out.println(~5);

        // because
        // 5 is 0000101
        // 1's complement is 1111010 
        // most significan bit which is 1 that is why it is negative
        // when we want to find value of negative number that time we go with 2's complement
        // in 2's complement first we change the value and add with 1 and give negative sign
        // that is why 1111010 become -- 000101 + 1 = 110 = 6
        // it is a negative number that is why the answer is -6
    }
}
