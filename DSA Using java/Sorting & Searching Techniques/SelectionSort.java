import java.util.*;
// Create a class named as Selection sort
public class SelectionSort {
    // Create a method to perform the sorting operation
    public static void selectionSort(int[] arr){ // initialize a empty array 
        int n = arr.length; // to read all the elements using length function
        
        // First loop to find the minimum elements from the input
        for(int i=0; i<n-1; i++){
            int minIndex = i;

        // Second loop to compare the minimum elements with the remaning 
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
        // Swap if the element is lesser using by initializing temp  
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {100,50,25,10,15,70,45,60};
        System.out.println("The original array before performing the Selection sort operation: "+Arrays.toString(arr));
        selectionSort(arr); // to perform the operation declare in the above method
        System.out.println("The array after performing the Selection sort operation: "+Arrays.toString(arr));


    }
    
}
