import java.util.Scanner; // Import Scanner class for user input

public class QuickSortProductPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt(); // Read the number of products

        double[] prices = new double[n]; // Create an array to store product prices

        // Take input for product prices
        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextDouble(); // Read product price
        }

        // Call quick sort function
        quickSort(prices, 0, n - 1);

        // Display sorted product prices
        System.out.println("Sorted product prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " "); // Print sorted prices
        }
        
        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }

    // Quick Sort function
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++;
                // Swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return partition index
    }
}

/*
Sample Input:
Enter the number of products: 5
Enter the product prices:
450.75 120.50 299.99 99.99 200.25

Sample Output:
Sorted product prices in ascending order:
99.99 120.50 200.25 299.99 450.75
*/
