package Recursion;

import java.util.Scanner;

public class recursion04 {

    public static int findPaths(int rows, int columns){
        //base condition
        if (rows == 1 || columns == 1)  return 1;

        return (findPaths(rows-1, columns) + findPaths(rows,columns-1));
    }
    public static void main(String ar [] ){
        System.out.println("\nAll paths in a 2-d matrix using recursion\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows followed by columns");

        int rows = scan.nextInt();
        int columns = scan.nextInt();

        int result = findPaths(rows, columns);
        System.out.println("2D matrix has "+ rows+ " rows and "+ columns + " columns");
        System.out.println("Total number of paths is : "+ result);

        scan.close();
    }
}
