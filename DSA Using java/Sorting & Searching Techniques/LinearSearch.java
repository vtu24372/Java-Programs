import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {19, 20, 77, 65, 40, 10};
        int target = 10;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("The value is found: " + target + " at index " + index);
        } else {
            System.out.println("The value not found");
        }
    }
}
