// Sub string - A small part of a string
public class string_08 {
    // user defined substring function
    public static String subString( String str, int start , int end){
        String concate = "";
        for(int i = start; i < end; i++){
            concate+= str.charAt(i);
        }
        return concate;
    }
    public static void main(String[] args) {
        String str = "Rahul.. is a software engineer at google";
        // in built method
        System.out.println(str.substring(3, 6));
        System.out.println(subString(str, 3, 6));

    }
}
