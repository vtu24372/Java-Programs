import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 70;

        int index = binarySearch(array, target);

        if (index != -1) { 
            System.out.println("Element is found: " + target + " at index " + index);
        } else {
            System.out.println("Element is not found: " + target);
        }
    }
}
