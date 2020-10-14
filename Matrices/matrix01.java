package Matrices; 

import java.util.Scanner;

public class matrix01 {
    public static void main(String ar [] ){

        System.out.println("\nFind sum of all elements in a matrix\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows and columns in the matrix");

        int rows = scan.nextInt();
        int columns = scan.nextInt();

        System.out.println("Enter matrix elements " + (rows*columns) + " in number");

        int arr [][] = new int [rows][columns];
        //input array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nDisplaying array elements");

        //display array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        } 

        //sum array elements
        int sum = 0;
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of array elements is : " + sum);
        scan.close();
    }
}
