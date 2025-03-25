import java.util.Scanner; // Import Scanner class for user input

public class BubbleSortMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt(); // Read the number of students

        int[] marks = new int[n]; // Create an array to store marks

        // Take input for student marks
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt(); // Read marks
        }

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
                if (marks[j] > marks[j + 1]) { // Swap if current element is greater than next
                    // Swapping elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        // Display sorted marks
        System.out.println("Sorted marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " "); // Print sorted marks
        }
        
        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }
}

/*
Sample Input:
Enter the number of students: 5
Enter the marks of students:
45 78 23 89 12

Sample Output:
Sorted marks in ascending order:
12 23 45 78 89
*/
