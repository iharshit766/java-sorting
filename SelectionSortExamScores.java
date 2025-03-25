import java.util.Scanner; // Import Scanner class for user input

public class SelectionSortExamScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt(); // Read the number of students

        int[] scores = new int[n]; // Create an array to store exam scores

        // Take input for exam scores
        System.out.println("Enter the exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt(); // Read exam score
        }

        // Call selection sort function
        selectionSort(scores);

        // Display sorted exam scores
        System.out.println("Sorted exam scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " "); // Print sorted scores
        }

        System.out.println(); // New line for better readability
        scanner.close(); // Close Scanner object
    }

    // Selection Sort function
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

/*
Sample Input:
Enter the number of students: 5
Enter the exam scores:
78 92 85 67 90

Sample Output:
Sorted exam scores in ascending order:
67 78 85 90 92
*/
