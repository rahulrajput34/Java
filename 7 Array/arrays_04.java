// leanear search       // time complexity -- big of n   0(n)
public class arrays_04 {
    public static int leanearSearch(int numbers[], int n){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 4, 5, 6, 76, 34, 32, 12, 23, 10};
        int index = leanearSearch(numbers, 760);
        
        if( index == -1){
            System.out.println("Not found");
        } else{
            System.out.println("the index is : " + index);
        }
    }
}
