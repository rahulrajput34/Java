// Spiral matrix
public class twoD_arrays_02 {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcolumn = matrix[0].length -1;
        
        // first line for how mant time loops run
        while (startRow <= endrow && startcol <= endcolumn) {
            // For outer boundry:
            // top  boundry
            for (int i = startcol; i <= endcolumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolumn] + " ");
            }
            // bottom
            for (int i = endcolumn - 1; i >= startcol; i--) {
                //if this happen that time we already print all the elements in top part
                // we dont want to repeate the elements that is why we gave break if startcolumn == endcolumn
                // if the row is odd that time we have to do
                if(startcol == endcolumn){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startcol] + " ");
                // we dont want repeatations that is why done this
                if(startcol == endcolumn){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }
            //For inner boundry:
            startRow++;
            endrow --;
            startcol++;
            endcolumn--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 2, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }
}
