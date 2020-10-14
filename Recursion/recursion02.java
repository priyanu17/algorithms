package Recursion;

import java.util.Scanner;

public class recursion02 {

    public static int power(int base, int exponent){
        //base condition
        if (exponent == 0)
            return 1;
        return base * power(base, exponent-1);
    }
    public static void main(String ar [] ){


        System.out.println("\nFind the power using recursion\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base followed by exponent ");
        int base = scan.nextInt();
        int exponent = scan.nextInt();

        int result = 0;
        if (exponent >0 ){
        result = power(base, exponent);
        }
        System.out.println("The result is : " + result);
        scan.close();
    }
}
