// Question 1: 
public class loops_18 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hellow");
            i+=2; // two hello because i++ make i = 1  // first iteration
            //then i = i + 2 --> i = 3 // second iteration
            //then i++ = i = 4  then i + 2 = 6 then  // loop break
        }
    }
}
