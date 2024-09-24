// Question 1:
public class Operators_07 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        // this one first do x*y = 2*5 = 10 then do x*y / x = ans = 5
        int exp2 = (x * (y / x));
        // this first do y/x = data type is int that is truncate the value into decimal
        // that is why 5/2 = 2  then do x*(2) = ans = 4.
        System.out.println(exp1);
        System.out.println(exp2);
        

    }
}
