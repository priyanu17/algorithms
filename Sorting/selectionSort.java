package Sorting;

public class selectionSort{
    public static void main(String args []){
        
        int arr [] = {99, 88, 77, 66, 55, 44, 33, 22, 11};

        System.out.println("Array before sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

        //selection sort
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;

            for(int j=i+1; j<arr.length; j++)
                if( arr[j] < arr[minIndex]) minIndex = j;

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.println("Array after sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();
    }



}