//basic recursion code for printing no.
public class recursion{
    static void printnumber(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[] args) {
        printnumber(1);
    }
}
 //make a string and remove the given char from it
public class removechar{
    public static void main(String[] args){
        String str="abcd";
        char remove = 'a';
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                result += str.charAt(i);
            }
        //  System.out.println(result);
        }
        System.out.println(result);
    }
}
// take a string and reverse it using recursion

// public class rev{
//     static void reverse(String str){
//         if(str.lenght()==0){
//             return;
//         }
//         System.out.println(str.charAt(str.length()-1));
//         reverse(str.substring(0.str.length()-1));
//         // System.out.println(n);
//         // printnumber(n-1);
//     }
//     public static void main(String[] args) {
//         String str="hello";
//         reverse(str);
//         // String result= reverse(str);
//         // System.out.println(result);
//     }
// }


public class rev {

    static void reverse(String str){
        if(str.length() == 0)
            return;

        System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        String str = "hello";
        reverse(str);
    }
}
 //take two strings and convert them to integer and multiply
public class strtoint{
    public static void main(String[] args) {
        String str1="10";
        String str2="5";
        int result;
        int n1=Integer.valueOf(str1);   //converts string to int
        int n2=Integer.valueOf(str2);
        result = n1*n2;
        System.out.println(result);
    }
}
 //wap to convert a string into a substring and count the one which has same first and last

public class substringcount{
    public static void main(String[] args) {
        String str = "abc";
        int count=0;
       // System.out.println(str.length());
        for(int i=0;i<str.length();i++){
           for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
             }         
            
        }
        System.out.println(count);
     }
         //System.out.println(str.substring(0,));
 }