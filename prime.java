// public class factorial{
//     public static void main(String[] args){
//         int num=5;
//         int fact=1;
//         for(int i =1;i<=num;i++){
//             fact=fact*i;
//         }
//         System.out.println("factorial =" +fact);
//     }
// }

 public class prime {
    public static void main(String[] args){
        int num=7;
        boolean prime=true;
      for(int i=2;i<num;i++){
        if(num%i==0){
            prime=false;
            break;
        }
      }
      
        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
