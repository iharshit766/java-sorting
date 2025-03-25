import java.util.Scanner; // Import Scanner class for user input

public class CountingSortStudentAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt(); // Read the number of students

        int[] ages = new int[n]; // Create an array to store student ages

        // Take input for student ages
        System.out.println("Enter the ages of students (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt(); // Read student age
        }

        // Call counting sort function
        countingSort(ages);

        // Display sorted student ages
        System.out.println("Sorted student ages in ascending order:");
        for (int age : ages) {
            System.out.print(age + " "); // Print sorted ages
        }

        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }

    // Counting Sort function
    public static void countingSort(int[] arr) {
        int min = 10, max = 18; // Given age range
        int range = max - min + 1;
        int[] count = new int[range]; // Frequency array
        int[] output = new int[arr.length]; // Output array

        // Count occurrences of each age
        for (int age : arr) {
            count[age - min]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}

/*
Sample Input:
Enter the number of students: 6
Enter the ages of students (between 10 and 18):
12 15 14 18 11 13

Sample Output:
Sorted student ages in ascending order:
11 12 13 14 15 18
*/