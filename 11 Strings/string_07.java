// String comparison
// when we create a string without a new key word that time it points to the same already created string    
// when we create a string with new keyword that time it would create a new sperated string in new location.

public class string_07 {
    public static void main(String[] args) {
        String s1  = "rahul";
        String s2  = "rahul";
        String s3  = new String("rahul");

        if(s1  == s2 ){
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are no equal");
        }
        if(s1  == s3 ){
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are no equal");
        }

        // that is why we use inbuilt function to compare value
        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are no equal");
        }
    }
}
