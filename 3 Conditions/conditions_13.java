// question 4

public class conditions_13 {
    public static void main(String[] args) {
        int a = 63 , b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;

        System.out.println(x); // false
        System.out.println(y); // 63
    }
}