// question 1:
public class patterns_01 {
    public static void main(String[] args) {
        for (int line = 0; line <= 4; line++) {   // column 4 that is why run 4 time
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
