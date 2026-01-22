import java.util.Arrays;

public class MergeSort {

    
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;                 

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;                      

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];      
            } else {
                arr[k++] = R[j++];      
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);            
    }

    public static void main(String[] args) {
        int[] arr = {12, 48, 38, 24, 50, 62, 86, 98, 74};

        System.out.println("Before: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);   
        System.out.println("After : " + Arrays.toString(arr));
    }
}
