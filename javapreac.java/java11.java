import java.util.*;

// public class java11 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int numbers[]= new int[size];

//         for(int i=0; i<size;i++){
//             System.out.println(numbers [i]);
//         }
//     }
// }



// public class java11 {
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//      int size=sc.nextInt();
//      int arr[]=new int[size];
//      int sum=0;
//      for(int i=0;i<size;i++){
//         arr[i]=sc.nextInt();
//         sum=sum+arr[i];

//      }
//      System.out.println("sum="+sum);
//             }
//     }


// import java.util.*;


//  public class java11 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//            int max=arr[0];

//            for(int i=1;i<size;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//            }
//            System.out.println("max="+max);
//     }
//  }



  public class java11 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();

      }
      int min=arr[0];
      for(int i=1;i<size;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        
      }
      System.out.println("min="+min);
    }
    
  }