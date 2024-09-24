// Question 4:
public class patterns_04 {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 4;
        
        for (int line = 0; line < num; line++) {
            for (int chars = 0; chars <= line ; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
}
