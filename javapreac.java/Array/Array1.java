// public class Array1 {
//     public static  void main( String[] args){
//         int []arr={3,19,56,9,18,24,85,14};
//         int n=arr.length;
//         // for(int i=0;i<i/2;i++){
//         //     int temp=arr[i];
//         //     arr[i]=arr[n-1-i];
//         //     arr[n-1-i]=temp;
//           int i=0,j=n-1;
//           while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//           }
//         for(int ele: arr){
//             System.out.println(ele+ " ");
//         }
//     }

// }




// public class Array1 {
//     public static  void main( String[] args){
//         int []arr={3,19,56,9,18,24,85,14};
//         int n=arr.length;
//         // for(int i=0;i<i/2;i++){
//         //     int temp=arr[i];
//         //     arr[i]=arr[n-1-i];
//         //     arr[n-1-i]=temp;
//           int i=2,j=5;
//           while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//           }
//         for(int ele: arr){
//             System.out.println(ele+ " ");
//         }
//     }

// }



///////////////ROTATE ARRAY/////////


// public class Array1 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         int d = 2;

//         d = d % n;

//         reverse(arr, 0, d - 1);
//         reverse(arr, d, n - 1);
//         reverse(arr, 0, n - 1);

//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }
//     }

//     static void reverse(int[] arr, int i, int j) {
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;

//             i++;
//             j--;
//         }
//     }
// // }





//  public class Array1 {
//      public static void main(String[] args) {
//          int[] arr = {1, 2,5, 3, 4, 5};
//          for(int i=0;i<arr.length;i++){
//             for(  int j=i+1;j<arr.length;j++){
//                 if(arr[i]== arr[j]){
//                     System.out.println( arr[i]);
//                 }
//             }
//          }
      
//       }
//     }


// public class Array1{
    
//     public  static void main(String[] args){
//         int[]arr={6,3,2,4,2};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j= 0;j<arr.length-1;j++){
//              if(arr[j]>arr[j+1]){
//                 int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;

//              }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//          System.out.println(arr[i]+" ");
//         }
//     }
// }






public class Array1{
    
    public  static void main(String[] args){
        int[]arr={6,3,2,4,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j= 0;j<arr.length-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;

             }
            }
        }
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
        }
    }
}





