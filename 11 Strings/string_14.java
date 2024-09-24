// Question - string compression (Amazon)
public class string_14 {
    public static String stringCompression(String str){
        // string builder
        StringBuilder sb = new StringBuilder("");

        //loop for reach every charactar of given string
        for(int i = 0; i < str.length(); i++){
            // to count muber of charactars
            Integer count = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;  // for making sure the value repeats only once
            }
            // to append charactar
            sb.append(str.charAt(i));
            if( count > 1){
                // to append numbers if the value is more than one
                sb.append(count.toString());
            }
        } 
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcccdddd";
        System.out.println(stringCompression(str));
    }
}
