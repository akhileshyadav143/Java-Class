// Question #1 (Sum & Average)


// public class hi {
//     public static void main(String[] args) {
//      int [] arr={12,3,4,5,66};
//      int sum=0;
     
//      for(int i=0;i<arr.length;i++){
//          sum=sum+arr[i];

//      }
//      double avg=(double)sum/arr.length;
//      System.out.println(sum);
//      System.out.println(avg);

//     }
// }











// 
// question #2 (Linear Search)


// public class hi {

//     public static void main(String[] args) {
//         int arr[]={12,3,4,45,56};
//         int target=8;

//         boolean found=false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 found=true;
//                 System.out.println(i);
//                 break;
//             }
//         }
//     if(!found){
//       System.out.println(-1);
//     }
//     }
// }





// Question #4 (Ek number kitni baar aaya hai, ginti karna)



public  class hi {

    public static void main(String[] args) {
        int arr[]={2,43,5,2,5,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(target);
    }
}



