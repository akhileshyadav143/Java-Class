// import  java.util.*;


// public class Arraylist1
//  {
//     public static void main(String[] args) {
//       ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
//       Collections.reverse(list);
//       System.out.println(list);
//     }
// }

// import java.util.*;
// public  class Arraylist1 {

//   public static void main(String[] args) {
//     ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,34,2,4,223,4,55));
      
//     int max=Integer.MIN_VALUE;
//     int secondmax=Integer.MIN_VALUE;
//     for(int num: list){
//       if(num>max){
//         secondmax=max;
//         max=num;


//       }else if(num>secondmax && num!=max){
//          secondmax=num;
//       }

      
//     }
//     System.out.println(secondmax);
//   }
// }

import java.util.*;

public class Arraylist1 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers=new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);

        
    System.out.println(numbers);
    System.out.println(numbers.get(0));
      System.out.println(numbers.get(1));
      
        System.out.println(numbers.get(2));
          System.out.println(numbers.size());
  numbers.set(2,50);
  System.out.println(numbers);

  numbers.remove(3);
  System.out.println(numbers);
  System.out.println(numbers.isEmpty());


  
   
  }
  
}




