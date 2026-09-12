import java.util.*;
public class function {
    public static int  claculatesum(int a, int b){
        int sum = a+b;
        return sum;


        
    }
      public static void  main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

    
       int sum= claculatesum(a, b);
        
     System.out.println("sum is :"+ sum);
      }
}
