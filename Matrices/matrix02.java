package Matrices;

import java.util.Scanner;

public class matrix02 {
    public static void main(String ar []){

        System.out.println("\nFind sum of two matrices\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows and columns in the matrices");

        int rows = scan.nextInt();
        int columns = scan.nextInt();

        System.out.println("Enter matrix (1) elements " + (rows*columns) + " in number");

        int arr1 [][] = new int [rows][columns];
        //input array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nDisplaying array (1) elements");

        //display array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        } 
        

        System.out.println("Enter matrix(2) elements " + (rows*columns) + " in number");

        int arr2 [][] = new int [rows][columns];
        //input array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("\nDisplaying array(2) elements");

        //display array elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        } 


        int resultArr [][] = new int [rows][columns];
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                resultArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Displaying result matrix");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(resultArr[i][j] + "  ");
            }
            System.out.println();
        } 

    }
}