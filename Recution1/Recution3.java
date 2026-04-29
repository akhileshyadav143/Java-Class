// // package Recution1;

// // // arr={1,2,1}
// // // k==2;
// // // 1
// // // 1,2
// // // 1,2,1
// // // 2
// // // 1,1
// // public class Recution3 {
    

// //     static void count(int[] arr, int i, int k, int sum, int[] ans, int size){
// //         if(i == arr.length){
// //             if(sum == k){
// //                 for(int j = 0; j < size; j++){
// //                     System.out.print(ans[j] + " ");
// //                 }
// //                 System.out.println();
// //             }
// //             return;
// //         }

// //         // include
// //         ans[size] = arr[i];
// //         count(arr, i+1, k, sum + arr[i], ans, size+1);

// //         // exclude
// //         count(arr, i+1, k, sum, ans, size);
// //     }

// //     public static void main(String[] args){
// //         int[] arr = {1,2,1};
// //         int k = 2;
// //         int i = 0;
// //         int sum = 0;
// //         int[] ans = new int[arr.length];
// //         int size = 0;

// //         count(arr,i,k,sum,ans,size);
// //     }
// // }


// // count
// public class Recution3 {
    

//     static int count(int[] arr, int i, int k, int sum ){
//         if(i == arr.length){
//             if(sum == k){
//                 return 1;
              
                
//             }
//             return 0;
//         }

//         // include
//         int x=
//         int y=
//         // exclude
//         count(arr, i+1, k );
//     }

//     public static void main(String[] args){
//         int[] arr = {1,2,1};
//         int k = 2;
//         int i = 0;
//         int sum=0;
   

//         count(arr,i,k,sum,ans,size);
//     }
// }


// //permutation



