// 1.bubble sort
// timecomplexity - 0(n2)
// large elements come to the end of array by swapping with adjacent elements

// step 1
// for first loop
// the elements can goes to length - 1
// step 2
// for second loop
// the elements can goes lenth - 1 but - turn as well because one turn is finished than last one in their own position then we iteralte loop less than one time that is why second loop run lenth - 1 - turn
// step 3
//if the above element is greter than after one than we change the place
// and we done this by swaping

public class sorting_02 {
    public static void bubblesort(int arr[]) {
        // int totalswap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted so we can exit to save time
            if (swap == 0) {
                break;
            }
        }
        for (int index = 0; index < arr.length - 1; index++) {
            System.out.print(arr[index] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 3, 4, 5 };
        bubblesort(arr);

    }
}
