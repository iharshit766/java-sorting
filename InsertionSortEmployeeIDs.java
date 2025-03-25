import java.util.Scanner; // Import Scanner class for user input

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt(); // Read the number of employees

        int[] employeeIDs = new int[n]; // Create an array to store employee IDs

        // Take input for employee IDs
        System.out.println("Enter the employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = scanner.nextInt(); // Read employee ID
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) { // Start from the second element
            int key = employeeIDs[i]; // Store the current element
            int j = i - 1;

            // Shift elements of the sorted part to the right to find the correct position
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }
            employeeIDs[j + 1] = key; // Insert the element at the correct position
        }

        // Display sorted employee IDs
        System.out.println("Sorted employee IDs in ascending order:");
        for (int id : employeeIDs) {
            System.out.print(id + " "); // Print sorted employee IDs
        }
        
        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }
}

/*
Sample Input:
Enter the number of employees: 5
Enter the employee IDs:
104 102 108 101 105

Sample Output:
Sorted employee IDs in ascending order:
101 102 104 105 108
*/
