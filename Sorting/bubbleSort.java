package Sorting;

public class bubbleSort {
    public static void main(String args []){

        int arr [] = {99, 88, 77, 66, 55, 44, 33, 22, 11};

        System.out.println("Array before sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

        //bubble sort
        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println("Array after sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();
    }
}
