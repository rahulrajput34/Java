// Question 2: // this what I understand, the given answer is not covered in syllabus
public class arrays_08 {

    public static int findIndex(int number[], int target) {
        int start = 0;
        int end = number.length - 1;
        while (number[start] <= number[end]) {
            int mid = (start + end) / 2;

            if (number[mid] == target) {
                return mid;
            }

            if (number[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int target = 0;
        int index = findIndex(number, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
