import java.util.Scanner; // Import Scanner class for user input

public class MergeSortBookPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of books
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt(); // Read the number of books

        double[] prices = new double[n]; // Create an array to store book prices

        // Take input for book prices
        System.out.println("Enter the book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextDouble(); // Read book price
        }

        // Call merge sort function
        mergeSort(prices, 0, n - 1);

        // Display sorted book prices
        System.out.println("Sorted book prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " "); // Print sorted prices
        }
        
        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }

    // Merge Sort function
    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to merge sorted halves
    public static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

/*
Sample Input:
Enter the number of books: 5
Enter the book prices:
299.99 150.50 450.00 99.99 200.75

Sample Output:
Sorted book prices in ascending order:
99.99 150.50 200.75 299.99 450.00
*/
