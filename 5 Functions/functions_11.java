// Function overloading with the number of parametres
// we provide same functions but still it yet not given any error

public class functions_11 {
    
    public static int sum(int a , int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(10, 15));
        System.out.println(sum(10, 15, 20));
    }
}
