// We can also do by direct approach, the below approch is a authenticated code.
// staircase search
public class twoD_arrays_04 {
    public static boolean stairCaseSearch(int matrix[][], int key) {
        // start from first row last column
        int row = 0;
        int col = matrix[0].length - 1;
        // it is abious that row (row < matrix.length && col >= 0 ) this is not follow that time key is not there
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("The key found at" + "(" + row + "," + col + ") index");
                return true;
            // find smaller one or bigger one
            // for smaller one -- go step back in column  -- col--
            // for bigger one -- go down -- row++
            } else if (key < matrix[row][col]) {
                col--; // because for this given sorted matrix, from our logic, we have to go left when key is smaller than matrix[row][col]
            } else {
                row++; // because for this given sorted matrix, from our logic, we have to go right when key is bigger than matrix[row][col] 
            }
        }
        System.out.println("The key not found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 58 } };
        stairCaseSearch(matrix, 58);
    }
}
