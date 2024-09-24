// Counting sort
// Used when arrays has small values of numbers like 1 to 100 
// mostly used for positive integers
// time complexity 0(n + range)

public class sorting_06 {
    public static void countingSort(int numbers[]){
        // for largest
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }
        //count how many numbers we have
        int count[] = new int[largest+1];  // (largest+1) because we start at zero
        for(int i=0; i<numbers.length; i++){
            count[numbers[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0){  // we are reducing a number
                numbers[j] = i;
                j++;
                count[i]--;
            }   
        }   
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,1,3,2,4,3,7};
        countingSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
