// function overloading with data types 
public class functions_12 {
    public static int sum(int a , int b){
        return a + b;
    }
    public static float sum(float a, float b){   // different data types but same function name
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2.3f, 2.7f));
        System.out.println(sum(10, 10));
    }
}
