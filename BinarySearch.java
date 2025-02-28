import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the list.");
       } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                right = mid - 1;
            } else { // Search right subarray
                left = mid + 1;
            }
        }

        return -1;
    }
}