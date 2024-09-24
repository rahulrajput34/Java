// Type conversion
// type conversion is happen when type is compatible(like it able to do that)
// second condition is - destination type > source type

// byte < short < int < float < double

public class basics_04 {
    public static void main(String[] args) {
        byte a = 12;
        int b = a;
        System.out.println(b);
        //it is possible

        int c = 23;
    //  byte d = c;   this the conversion from big to small it will through en error
    //  to do that, we have to do lossy conversion
        byte d = (byte) c;    
        System.out.println(d);
        

    }
}
