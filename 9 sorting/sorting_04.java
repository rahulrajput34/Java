// insertion sort
// timecomplexity - 0(n2)
//pick an element from unsorted part and place in the right position
public class sorting_04 {
    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // to find currrect position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 122, 31, 4, 5, 6, 31, 4, 5 };
        insertionSort(arr);
    }
}
