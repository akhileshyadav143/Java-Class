

// public class Main {
//     public static  void fun(int n){
//             if(n==0){
//                 return ;
//             }
//             System.out.println(n);
//             fun(n-1);
//         }
//     public static void  main(String[] args){
       
//           fun(5);
//         }
        
//     }


    // public class Main{
    //     public static  int fun(int n){
    //         if(n==0){
    //             return 0;

    //         }
    //         return n+fun(n-1);

    //     }
    //     public static void main(String[] args){
    //         System.out.println(fun(4));
    //     }
    // }



    // public class Main{
    //     public static int hi(int n){
    //         if(n==1){
    //             return 1 ;

    //         }
    //         return n * hi(n-1);

    //     }
    //     public static void main(String[] args) {
    //         System.out.println(hi(5));
    //     }
    // }




    // public class Main{
    //     public static  int power( int a,int n){
    //         if(n==0){
    //             return 1;

    //         }
    //         return a * power(a,n-1);
    //     }
    //     public static void main(String[] args) {
    //         System.out.println(power(2,2));
    //     }
    // }




    // public class Main{
    //     public static int digitsum(int n){
    //         if(n==0){
    //             return 0;

    //         }
    //         return (n%10)+ digitsum(n/10);

    //     }

    //     public static void main(String[] args) {
    //         System.out.println(digitsum(1234));
    //     }
    // }


    // public class Main{
    //     public static void rev(int n){
    //         if(n==0){
    //             return;
       
    //         }
    //           System.out.println(n%10);
    //           rev(n/10);
    //     }
    //     public static void main(String[] args) {
    //         rev(5678);
    //     }
    // }














    
    public class Main{
        public static int count(int n){
            if(n==0){
                return 0;
       
            }
             
            return 1+ count(n/10);
        }
        public static void main(String[] args) {
           System.out.println(count(5678)); 
        }
    }