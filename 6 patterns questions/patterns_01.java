// Hollow rectangle
public class patterns_01 {

    public static void hollow_rectangle(int totrows, int totcols){
        // outer loop
        for (int i = 1; i <= totrows; i++) {
            // inner loop
            for (int j = 1; j <= totcols; j++) {
                if( i == 1 || i == 4 || j == 1 || j == 5 ){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}