import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array) {
        if (array == null || array.length == 0) {  
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(array, low, high);
        sort(array, low, pivotIndex - 1);
        sort(array, pivotIndex + 1, high);
    }

    
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) { 
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 30, 50, 70, 20, 90, 80, 100};

        System.out.println("The original array before sorting operation");
        printArray(array);

        quickSort(array);

        System.out.println("The array after the Quick sort operations");
        printArray(array);

        
    }
}
