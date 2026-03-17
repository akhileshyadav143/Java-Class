//functions
import java.util.*;
// public class java9  {
//        public static void printMyName(String name) {
//         System.out.println(name);
//         return ;
//        }
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        printMyName(name); ///class function
//     }
// }  


// public class java9  {
//        public static int calculateSum (int a, int b) {
//         int sum=a+b;
//         return sum;
//        }
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();

//        int sum=calculateSum (a,b);
//        System.out.println("sum of 2 number is:"+sum);
//     }
// }  

// public class java9  {
//        public static int calculateproduct (int a, int b) {
//         int product=a*b;
//         return product;
//        }
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();

//        int product=calculateproduct (a,b);
//        System.out.println("product of 2 number is:"+product);
//     }
// }  

public class java9  {
       public static void  printfactorial( int n){
         int factorial =1;
         for(int i=n;i>=1;i--){
          factorial= factorial*i;
         }
         
       }
       
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
}  