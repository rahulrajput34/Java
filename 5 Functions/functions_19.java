// block scope : we can use varibale inside the curly brackats not outside of that. 
public class functions_19 {
    public static void main(String[] args) {
        int a = 20; // we can do it because it is inside the curlybrackets
        {
            int b = 40;
            System.out.println(a);
            System.out.println(b);
        }
        // System.out.println(b); // we can not do it
        System.out.println(a); // we can do it because it is inside the curlybrackets
    }
}
