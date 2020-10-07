import java.util.Scanner;

public class problem3 {
    public static void main(String ar [] ){
        System.out.println("\nFind product of two matrices\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows and columns in the matrix(1)");
        int rows1 = scan.nextInt();
        int columns1 = scan.nextInt();
        System.out.println("Enter number of rows and columns in the matrix(2)");
        int rows2 = scan.nextInt();
        int columns2 = scan.nextInt();
        
        //start of if
        if (columns1 == rows2){

        int arr1 [][] = new int [rows1][columns1];
        System.out.println("Enter matrix (1) elements " + (rows1*columns1) + " in number");
        //input array elements
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter matrix (1) elements " + (rows1*columns1) + " in number");

        System.out.println("\nDisplaying array(1) elements");

        //display array elements
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        } 
        System.out.println("Enter matrix (2) elements " + (rows2*columns2) + " in number");

        int arr2 [][] = new int [rows2][columns2];
        //input array elements
        for (int i=0; i<rows2; i++){
            for (int j=0; j<columns2; j++){
                arr2[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nDisplaying array(2) elements");

        //display array elements
        for (int i=0; i<rows2; i++){
            for (int j=0; j<columns2; j++){
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        } 

        int resultMatrix [] [] = new int [rows1][columns2];

        for (int i=0; i<rows1; i++){
            for(int j=0; j<columns2; j++){
                int inputElement = 0;
                for(int k=0; k<columns1; k++){
                    inputElement += arr1[i][k] * arr2[k][j];
                }
                resultMatrix[i][j] = inputElement;
            }
        }
        System.out.println("\nDisplaying result matrix elements");
        //display result array elements
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns2; j++){
                System.out.print(resultMatrix[i][j] + "  ");
            }
            System.out.println();
        } 
        }//end of  if
        else System.out.println("Matrix multiplication not possible");
        scan.close();

    }
}