package Sorting;

public class insertionSort{
    public static void main(String args [] ){

        int arr [] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Array before sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

        //applying insertion sort
        for(int i=0; i<arr.length; i++){
            int valToInsert = arr[i];
            int j= i-1;

            while(j>=0 && arr[j] > valToInsert){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = valToInsert;
        }

        System.out.println("Array after sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();
    }
}