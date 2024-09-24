// make pairs of the  given array.
public class arrays_09 {

    public static void pairsInArray(int numbers[]) {
        int totalpairs = 0;  // for total pairs
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(" ( " + numbers[i] + "," + numbers[j] + " )");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println(totalpairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairsInArray(numbers);
    }
}
