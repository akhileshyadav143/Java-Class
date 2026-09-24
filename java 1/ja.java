import java.util.Scanner;

public class ja {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>999 && n<1000){
        System.out.println("4 Digit number");
        }else{
        System.out.println("not  a digit no.");
        }
    }
}
