import java.util.Scanner;

class recursion1{

    public static int sumOfNumbers(int num){
        //base condition
        if (num == 1)
            return 1;
        return num + sumOfNumbers(num - 1);
    }

    public static void main(String ar [] ){

        System.out.println("\nSum of first n natural numbers\n");

        System.out.println("Enter natural number to find sum upto");
        Scanner scan = new Scanner(System.in);
        int numberToSum = scan.nextInt();
        int result = sumOfNumbers(numberToSum);
        System.out.println("Sum of first " + numberToSum + " natural numbers is : " + result);

        scan.close();
    }
}//end of class