public class twoD_arrays_03 {
    public static int diagonalSum(int matrix[][]) {
        // int startcol = 0;
        // int startRow = 0;
        // int endrow = matrix.length - 1;
        // int endcolumn = matrix[0].length - 1;
        int sum = 0;

        // direct approach but big time complexity
        // for (int i = startRow; i <= endrow; i++) {
        // for (int j = startcol; j <= endcolumn; j++) {
        // if(i == j){
        // sum += matrix[i][j];
        // }else if (i + j == endrow) { // i + j = matrix.length - 1
        // sum += matrix[i][j];
        // }
        // }
        // }

        // optimized approch
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != matrix.length - 1 - i) { // in case i == matrix.length - 1 - i then it has been already printed in primary diagonal..
                sum += matrix[i][matrix.length - i - 1]; // i + j = matrix.length - 1
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 2, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int diagonalSum = diagonalSum(matrix);
        System.out.println(diagonalSum);
    }
}
