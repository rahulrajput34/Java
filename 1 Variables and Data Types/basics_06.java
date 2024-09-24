public class basics_06 {
    public static void main(String[] args) {
        byte b = 5;
        // b = b*2;   -- this is not happen because it is converted into int...

        byte c = 6;
        b = (byte)(b*2);  // this is how we have to do lossy conversion...
        System.out.println(b);


    }
}
