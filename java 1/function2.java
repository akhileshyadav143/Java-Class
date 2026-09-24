import java.util.*;
import java.util.Scanner;
public class function2 {
    public static String name(){
        return "hello";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();

      name();
      System.out.println("name :"+ name );

    }
}
