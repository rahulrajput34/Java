public class string_15 {
    public static void calculatevowels( String str){
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u' ){
                count++;
            }
            
        }

        System.out.println("Total vowels inside this given string is : " + count);
    }
    public static void main(String[] args) {
        String str = "rahul is a good boy";
        calculatevowels(str);
    }
}
