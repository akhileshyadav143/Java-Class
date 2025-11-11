
// class Java{
//     public static void main(string[] args){
//         String a="aba";
//         String b="";
//         for(int i=a.length()-1;i>=0;i--){
//             b+=a.charAt(i);
//         }
//         if(a.equals(b)){
//             System.out.println("hai ");

//         }else{
//             System.out.println("nahi hai ");
//         }
//     }
// }
//palindrome check karne ka program
// class  Java{
//     public static void main(String[] args){
//         String a="madam";
//         String b="";
//         for(int i=a.length()-1;i>=0;i--){
//             b+=a.charAt(i);
//         }
//         if(a.equals(b)){
//             System.out.println("Palindrome hai ");

//         }else{
//             System.out.println("Palindrome nahi hai ");
//         }
//     }
// }

//wap to split a string and print each word in new line
// class  Java{
//     public static void main(String[] args){
//         String a="Hello World Welcome to Java";
//         String[] words=a.split(" ");
//         for(String word:words){
//             System.out.println(word);
//         }
//     }
// }

// //consonant vowel count in a sting
//  class Java{
//     public static void main(String[] args){
//         String a="Hello World";
//         int vowels=0;
//         int consonants=0;
//         for(int i=0;i<a.length();i++){
//             char c=a.charAt(i);
//             if(Character.isLetter(c)){
//                 if("AEIOUaeiou".indexOf(c)!=-1){
//                     vowels++;
//                 }else{
//                     consonants++;
//                 }
//             }
//         }
//         System.out.println("Vowels: "+vowels);
//         System.out.println("Consonants: "+consonants);
//     }
// }


//duplicate character in a string
// class Java{
//     public static void main(String[] args){
        
//     String str="hello";
//     String newstr="";
//     for(char ch :str.toCharArray()){
//         if(newstr.indexOf(ch)==-1){
//             newstr+=ch;
//         }
//     }
//     System.out.println(newstr);
// }
// }
    

// fricavancy count 
  
  // class Java {
  //   public static void main(String[] args){
  //     int freq[]=new int [256];
  //     String str="banana";
  //     for(char ch: str.toCharArray()){
  //       freq[ch]++;        
  //     }
  //     for(int i=0;i<256;i++){
  //       if(freq[i]>0)
  //       System.out.println((char)i+"->"+freq[i]);

  //     }
  //   }
  // }

//biggest  in string

  // class Java{
  //   public static void main(String[] args){
  //     String str="java is powerful";
  //     String a[]=str.split(" ");
  //     String largest=" ";
  //     for(String val:a){
  //       if(val.length()>largest.length()){
  //         largest=val;
  //       }
  //     }
  //     System.out.println(largest);
  //   }
  // }


// import java.util.Arrays;

// public class Java {
//     public static void main(String[] args) {
//         String a = "hello";
//         String b = "lloeh";

//         char ch1[] = a.toCharArray();
//         char ch2[] = b.toCharArray();

//         Arrays.sort(ch1);
//         Arrays.sort(ch2);

//         String str1 = new String(ch1);
//         String str2 = new String(ch2);

//         if (str1.equals(str2)) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }
// }



// class Java(){
// public static void main(String[] args){
//   StringBuilder str=new  StringBuilder("hello");
//   //str.append("byee");
//   str.insrt(1,"byee");
//   System.out.println(str);
// }
// }
// public class Java{
//   public static void main(String[] args){
//     String str="I love java";
//     String a[]=str.split(" ");
//     StringBuilder result=new StringBuilder();
//     for(String i:a){
//       StringBuilder data=new StringBuilder(i);
//       result.append(data.reverse().append(" "));
//     }
//     System.out.println(result);
//   }
// }

// public class hello{
// //static  int a=5;
// int data=20;
//   public static void main(String[]  args){
//     // int a=5;
//      hello obj=new hello(); 
//    // System.out.println(a);
//     System.out.println(obj.data);
//   }
// }

//how many types of methods

//   class hello{
//   static void sum(){
//     System.out.println("I am Akhilesh");
//   }
//   public static void main (String[] args){
//     hello obj=new  hello();
//     obj.sum();
//   }
// }
 


// class

class car{
   String name="jai mata dii..";
 static void sum(){
  car a=new car();
    System.out.println(a.name);
  }
}
class main{
  public static void main(String[] args){
    car obj=new car();
   obj.sum();
  }
}


