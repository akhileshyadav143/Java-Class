// import java.util.*;

// // public class DiagonalArray {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();   // size of matrix
//         int[][] arr = new int[n][n];

//         // Input matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Primary Diagonal
//         System.out.println("Primary Diagonal:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i][i] + " ");
//         }

//         // Secondary Diagonal
//         System.out.println("\nSecondary Diagonal:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i][n - i - 1] + " ");
//         }

//         sc.close();
//     }
// }


// import java.util.*;

// public class TransposeMatrix {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); // size
//         int[][] arr = new int[n][n];

//         // Input
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Transpose
//         System.out.println("Transpose Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[j][i] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


//  import java.util.*;

// public class TransposeMatrix {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); // size
//         int[][] arr = new int[n][n];

//         // Input
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Transpose
//         System.out.println("Transpose Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[j][i] + " ");
//             }
//             System.out.println();
//         }
        
//         int d=6;
//         boolean flag=false;
//         for(int i=0;i<n;i++){
//              for(int j=0;j<n;j++){
//                 if(arr[i][j]==d){
//                     flag=true;
//                     System.out.println("Found");
//                     break;

//                 }
//              }
//         }
//         if(!flag){
//             System.out.println("Not Found");
//         }
//         sc.close();
//     }
// }

import java.util.*;

// public class SpiralMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();   // rows
//         int m = sc.nextInt();   // columns

//         int arr[][] = new int[n][m];

        
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

       
//         int top = 0, bottom = n - 1;
//         int left = 0, right = m - 1;

//         while(top <= bottom && left <= right) {

          
//             for(int i = left; i <= right; i++) {
//                 System.out.print(arr[top][i] + " ");
//             }
//             top++;
        
          
//             for(int i = top; i <= bottom; i++) {
//                 System.out.print(arr[i][right] + " ");
//             }
//             right--;

           
//             if(top <= bottom) {
//                 for(int i = right; i >= left; i--) {
//                     System.out.print(arr[bottom][i] + " ");
//                 }
//                 bottom--;
//             }

        
//             if(left <= right) {
//                 for(int i = bottom; i >= top; i--) {
//                     System.out.print(arr[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
//     }
// } 


// wap to print waveform in matrix.

import java.util.*;

public class WaveMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input matrix
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Waveform print
        for(int i = 0; i < rows; i++) {
            if(i % 2 == 0) {
                // left to right
                for(int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for(int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}