import java.util.*;

public class ArrayOperations {

    // Method to read array from user
    public static int[] getArray(Scanner sc, int n) {
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to calculate average using streams
    public static double calculateAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }

    // Method to reverse array
    public static void printReversed(int[] arr) {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = getArray(sc, n);

            System.out.println("Original Array: " + Arrays.toString(arr));

            Arrays.sort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));

            int max = arr[n - 1];
            int min = arr[0];
            System.out.println("Max: " + max + ", Min: " + min);

            double average = calculateAverage(arr);
            System.out.println("Average: " + average);

            System.out.print("Enter element to search: ");
            int key = sc.nextInt();

            int index = Arrays.binarySearch(arr, key);
            if (index >= 0) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found.");
            }

            printReversed(arr);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}
