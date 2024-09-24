//FlOYD'S triangle

public class patterns_04 {
    public static void floydTriangle(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {  // line
            for (int j = 1; j <= i; j++) {  // inner loop
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
    }
}
