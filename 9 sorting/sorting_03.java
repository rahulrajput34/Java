// Selection sort
// timecomplexity - 0(n2)
// pick the smallest, put it at the beginning
 // i+1 thi comparison start karvani he etle i + 1
public class sorting_03 {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i; // just for under standing we created smallest
            for (int j = i + 1; j < arr.length; j++) {  // i+1 thi comparison start karvani he etle i + 1
                if( arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // swaping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
        }

        for (int index = 0; index < arr.length - 1; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 122, 31, 4, 5, 6, 31, 4, 5 };
        selectionSort(arr);

    }
}
