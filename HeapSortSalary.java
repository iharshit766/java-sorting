import java.util.Scanner; // Import Scanner class for user input

public class HeapSortSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of applicants
        System.out.print("Enter the number of job applicants: ");
        int n = scanner.nextInt(); // Read the number of applicants

        int[] salaries = new int[n]; // Create an array to store salary demands

        // Take input for salary demands
        System.out.println("Enter the expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextInt(); // Read salary demand
        }

        // Call heap sort function
        heapSort(salaries);

        // Display sorted salary demands
        System.out.println("Sorted salary demands in ascending order:");
        for (int salary : salaries) {
            System.out.print(salary + " "); // Print sorted salaries
        }

        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify function
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}

/*
Sample Input:
Enter the number of job applicants: 5
Enter the expected salary demands:
50000 70000 45000 60000 55000

Sample Output:
Sorted salary demands in ascending order:
45000 50000 55000 60000 70000
*/
