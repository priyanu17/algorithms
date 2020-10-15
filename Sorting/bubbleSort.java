package Sorting;

public class bubbleSort {
    public static void main(String args [] ){

        int arr [] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Array before sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

        //applying bubble sort
        for(int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println("Array after sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

    }
}
