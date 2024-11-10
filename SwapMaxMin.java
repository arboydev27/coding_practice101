import java.util.Arrays;
import java.util.Scanner;

public class SwapMaxMin {

    // Method to get the index of the smallest element in the array
    public static int getMinIndex(int[] source){
        int minIndex = 0; // Assume the first element is the smallest initially
        for (int i = 0; i < source.length; i++) {
            if (source[i] < source[minIndex]) { // Update minIndex if a smaller element is found
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to get the index of the largest element in the array
    public static int getMaxIndex(int[] source){
        int maxIndex = 0; // Assume the first element is the largest initially
        for (int i = 0; i < source.length; i++) {
            if (source[i] > source[maxIndex]) { // Update maxIndex if a larger element is found
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method to swap two elements in the array given their indices
    public static void swap(int[] array, int m, int n){
        int temp = array[m]; // Store the value of the element at index m
        array[m] = array[n]; // Assign the value at index n to index m
        array[n] = temp; // Assign the stored value to index n
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Initialize scanner for user input
        int[] array = new int[5]; // Create an array of size 5

        System.out.print("Please input 5 numbers, to make an array: ");
        for (int i = 0; i < 5; i++) { // Loop to get 5 numbers from the user
            array[i] = userInput.nextInt(); // Store each input in the array
        }
        System.out.println("Your array is: " + Arrays.toString(array)); // Display the original array

        int minIndex = getMinIndex(array);
        int maxIndex = getMaxIndex(array);
        swap(array, minIndex, maxIndex); // Swap the smallest and largest elements

        System.out.println("The new swapped array is: " + Arrays.toString(array));
        
        userInput.close();
    }
}
