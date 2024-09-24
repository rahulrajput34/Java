// Binary AND (|)
// in bitwise
// 0 | 0 = 0
// 0 | 1 = 1
// 1 | 0 = 1
// 1 | 1 = 1

public class bit_manuplation_03 {
    public static void main(String[] args) {
        System.out.println(5 | 6);
        // ans : 7
        
        // because 
        // 1 0 1   --> 5
        // 1 1 0   --> 6
        // ------
        // 1 1 1   -->  Ans = 7
    }
}
