//  Question 1: check if number is repeated or not
public class arrays_07 {
    public static boolean isEqOrNot(int numbs[]){
        for (int i = 0; i <= numbs.length - 1; i++) {
            for (int j = i+1; j <= numbs.length - 1; j++) {
                if(numbs[i] == numbs[j]){
                    return false;
                }
            }     
        }
        return true;
    }
    public static void main(String[] args) {
        int numbs[] = {1, 5, 4, 5, 5, 6};
        System.out.println(isEqOrNot(numbs));
        
       
    }
}
