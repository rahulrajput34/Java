// 2D arrays
// When we want to store a marks of 4 subjects that time we are going to use array
// but if we want to to this task for 10 students that time we are not going to do this task again and again
// that time we create a 2D array which will help to do this task fastly
// like a matrix in maths
// RGB for pictures we use 2D and 3D arrays
// it will store in memory row wise or column wise in different location with same size
// we can call row major if store row wise and colum major if store column wise

import java.util.Scanner;

public class twoD_arrays_01 {
    public static void searchingKey(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key){
                    System.out.println("The key found at" + "(" + i + "," + j + ") index");
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        // creating 2D array
        // 3 by 3 matrix
        // total cells 3*3 = 9
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the value at index:"  + "(" + i + "," + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchingKey(matrix, 2);
    }
}