import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare array and input elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();

        // Linear search
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at position: " + (i + 1));
                f = 1;
                break;
            }
        }

        if (f == 0) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
