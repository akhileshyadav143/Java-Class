// import java.util.Scanner;

// public class totalsum
 {

//     // function to print subarrays using recursion
//     public static void printSubarrays(int arr[], int start, int end) {
//         if (start == arr.length) {
//             return;
//         }

//         if (end == arr.length) {
//             printSubarrays(arr, start + 1, start + 1);
//             return;
//         }

//         // print current subarray
//         System.out.print("Subarray: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         // print sum using recursion
//         int sum = sumOfSubarray(arr, start, end);
//         System.out.print(" -> Sum: " + sum);

//         System.out.println();

//         // move end forward
//         printSubarrays(arr, start, end + 1);
//     }

//     // recursive function to calculate sum
//     public static int sumOfSubarray(int arr[], int i, int j) {
//         if (i > j) {
//             return 0;
//         }
//         return arr[i] + sumOfSubarray(arr, i + 1, j);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Subarrays with sum:");
//         printSubarrays(arr, 0, 0);
//     }
// }


