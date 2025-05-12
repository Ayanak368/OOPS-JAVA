import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear the buffer

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        Arrays.sort(strings); // sorting

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }
}
