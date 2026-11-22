// public  class prac {
    
// public static void main(String[] args) {

// int[] marks={1,2,3,4,5};
// for(int i=0;i<marks.length;i++){


// System.out.println(marks[i]);


// } 

// }
// } 


// public class prac {

//     public static void main(String[] args) {
//     int sum=0;
//     int a=10;
//     int b=20;


//     sum=a+b;
//     System.out.println(sum);

//     }
// }





// public class prac {

//     public static void main(String[] args) {
//         int n=5;
//     int squre=0;
//     squre=n*n;
//     System.out.println(squre);
//     }
// }



// public  class prac {

//     public static void main(String[] args) {
//        int n=13;
//        if(n%2==0){
//         System.out.println("even");
//        }else{
//         System.out.println("odd");
//        }
//     }
// }



// public class prac {

//     public static void main(String[] args) {
//        int n=8;
//         if(n>0){
//           System.out.println("positive");
//         }
//         else if(n<0){
//         System.out.println("nagative");
//         }
//         else{
//             System.out.println("zero");
//         }
        
//     }
// }

// public class prac {
//     public static void main(String[] args) {

//         int n = 20;

//         for (int i = 1; i <= n; i++) {

//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }




// public class prac {

//    public static  void main(String[] args){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         int spaces=2*(n-i);
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");

//         }
//     for( int j=1;j<=i;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//     }

//      for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         int spaces=2*(n-i);
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");

//         }
//     for( int j=1;j<=i;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//     }
//         }
//    }





        
    

// public  class prac {

    
//     public static void main(String[] args) {
//         int [] arr={12,34,13,67,35,77};
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
            
                
//             }
//         }
//         System.out.println(max);
//     }
// }






// public  class prac {

// public static void main(String[] args) {
//     int arr[]={12,34,5,7,2,563,53,5};
//     int max=Integer.MIN_VALUE;
//     int secondlarge=Integer.MIN_VALUE;
//      for(int i=0;i<arr.length;i++){
//         if(arr[i]>max){
//             secondlarge=max;
//             max=arr[i];

//         }
//         if(arr[i]>secondlarge && arr[i]!=max){
//             secondlarge=arr[i];
//         }
//      }
//      System.out.println(max);
//      System.out.println(secondlarge);
// }
// }






// public  class prac {

//     public static void main(String[] args) {
//         int arr[]={23,4,546,7,78,};
//         int min=arr[0];
//               for(int i=0;i<arr.length;i++){
//          if(arr[i]<min){
//            min=arr[i];
//          }       }
//          System.out.println(min);
//     }
// }





// public  class prac {

//     public static void main(String[] args) {
//         int arr[]={23,45,33,2,3,45,223,1};
//         int min=Integer.MAX_VALUE;
//         int secondmin=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 secondmin=min;
//                 min=arr[i];

//             }
//             else if(arr[i]<secondmin && arr[i]!=min){
//                 secondmin=arr[i];
//             }
//         }
//         System.out.println(min);
//         System.out.println(secondmin);
//     }
// }



// public class prac {

//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         boolean isSorterd=true;
//         for(int i=0;i<arr.length-1;i++){
//         if(arr[i]>arr[i+1]){
//             isSorterd=false;
//             break;

//         }

// }   
// if(isSorterd){
//     System.out.println("sorter");
// }else{
//     System.out.println("not sorter");
// }
//  }
// }