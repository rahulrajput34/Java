//String Builder
// String are immutable in java so that every time we change the given string that time it is going to create the that times strings in our memory. so it is going to effect our time complexity.
// to tackle this issue, we use sting builder.
public class string_12 {
    public static void main(String[] args) {
        // string builder

        StringBuilder s1 =  new StringBuilder("");
        for(char i = 'a'; i <= 'z'; i++){
            s1.append(i);
        }
        System.out.println(s1);
        // to convert string builder to string
        s1.toString();
        System.out.println(s1);


    }
}
