public class QuickSortAlgorithm {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }   
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main (String[] args) {
        // Test Case 1:
        int[] arr1 = {10, 7, 8, 9, 1, 5};
        int n = arr1.length;
        quickSort(arr1, 0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Test Case 2:
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        n = arr2.length;
        quickSort(arr2, 0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
