// Type promotion in expression
//1.Java automatically promotes each byte , or char operand to int when evaluting an expression.
// if one operand is long , float, or double the whole expressiob is promoted to long , float, or double repectively.

public class basics_05 {
    public static void main(String[] args) {
        // 1.
        short a = 5;
        byte b = 2;
        char c = 'c';
        int p  = a + b + c;
        System.out.println(p);

        //2.
        long d = 23432;
        float e = 23453.45f;
        double f = 33443322.67;
        // long x = d + e + f;  it is converted into double because double is big.
        // System.out.println(x);
        

    }
    
}

