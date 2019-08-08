public class Sorts {
    public static void main(String[] args) {
        int arr[] = {22, 16, 10, 6, 1, 22, -5};
            BubbleSort.sort(arr);
            ArrayTasks.printArray(arr);
    }

}

class SelectionSort {
   static void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;}

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

class InsertionSort {
    public static void sort (int [] arr) {
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                                arr[j] = arr[j-1];
                                arr[j-1] = temp;
                }
                else break;
            }
        }
    }
}

class BubbleSort {
    public static void sort(int [] arr) {
        boolean isSorted = false;
        for (int out = arr.length - 1; out>=1;out--) {
            for (int in = 0; in < out ; in++) {
                if(arr[in] > arr[in + 1]) {
                    int tmp = arr[in];
                    arr[in] = arr[in+1];
                    arr[in+1] = tmp;
                }

            }
        }
    }
}
