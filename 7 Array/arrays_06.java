// Binary search for reducing time complexicity.
// it is only helpful in shorted array.
// time complexity become propostional to logn
public class arrays_06 {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { //right
                start = mid + 1;
            }else {  //left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(binarySearch(number, 9));
    }
}
