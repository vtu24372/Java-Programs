import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length; 
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
        
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
    }
    public static void main(String[] args){
        int arr[] = {1,10,12,15,30,2};
        System.out.println("The original array before performing the Insertion sort operation: "+Arrays.toString(arr));
        insertionSort(arr); // to perform the operation declare in the above method
        System.out.println("The array after performing the Insertion sort operation: "+Arrays.toString(arr));


    }

    
}
