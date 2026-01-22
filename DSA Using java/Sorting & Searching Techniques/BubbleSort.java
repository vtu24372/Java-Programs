import java.util.*;
// Create a class and named as BubbleSort
public class BubbleSort {

    // Create a method and named as bubbleSort to perform the operation
    public static void bubbleSort(int[] arr){ // initialize array here as arr with empty size
        // to read all the element in the array use length function
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                // Compare both the elements in the array and swap if lesser
                if(arr[j]>arr[j+1]){
                    // initialize temp to perform the swap operation
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        // Declare the array elements to be sorted
        int arr[] = {14,6,2,15,3,1,13};
        System.out.println("The original array before performing the Bubble sort operation: "+Arrays.toString(arr));
        bubbleSort(arr); // to perform the operation declare in the above method
        System.out.println("The array after performing the Bubble sort operation: "+Arrays.toString(arr));

    }
    
}
