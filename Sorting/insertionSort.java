package Sorting;

public class insertionSort {
    public static void main(String args [] ){

        
        int arr [] = {99, 88, 77, 66, 55, 44, 33, 22, 11};

        System.out.println("Array before sorting");
        for(int element : arr) System.out.print(element + "  ");
        System.out.println();

        //insertion sort
        for(int i=1; i<arr.length; i++){
            int valToInsert= arr[i];
            int j=i-1;
            while(j >=0 && arr[j] > valToInsert){
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
