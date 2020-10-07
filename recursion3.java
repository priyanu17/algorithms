import java.util.Scanner;

public class recursion3 {
    static int stepCount = 0;

    public static long fastPower(int base, int exponent){
        //base condition
        if (exponent == 0) return 1;
        if(exponent%2 == 0){
            stepCount++;
            return fastPower(base*base, exponent/2);
        }
        else{
            stepCount++;
            return base * fastPower(base, exponent-1);
        }
    }

    public static void main(String ar [] ){

        System.out.println("\nFind the power using recursion (TC O(log(n)))\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base followed by exponent ");
        int base = scan.nextInt();
        int exponent = scan.nextInt();

        long result = 0;
        if (exponent >0 ){
        result = fastPower(base, exponent);
        }
        System.out.println("The result is : " + result);
        System.out.println("Step Count is : "+ stepCount);
        scan.close();
    }
}
