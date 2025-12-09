//iterator
// import java.util.ArrayList;
// import java.util.Iterator;
// public class java16 {
//     public static void main(String[] args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         Iterator<Integer> it=list.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//             if(it.next()==6){
//                 it.remove();
//             }
//         } 
//         System.out.println(list);
//     }
// }



// import java.util.ArrayList;
// import java.util.ListIterator;
// public class java16 {
//     public static void main(String[] args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//      ListIterator<Integer> it=list.listIterator();
//      while(it.hasNext()){
//         Integer x=it.next();
//         System.out.println(x);
     
    
// }
// while(it.hasprevious()){
//     Integer y=it.previous();
//     System.out.println(y);
// }
// }
// }



// import java.util.ArrayList;
// import java.util.ListIterator;
// public class java16 {
//     public static void main(String[] args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//      ListIterator<Integer> it=list.listIterator();
//      while(it.hasNext()){
//         Integer x=it.next();
//         if(x==7){
//        it.add(10);
//       // it.set(10);
 
//         }
//      }
//      System.out.println(list);
//     }
// }    

    
// import java.util.*;
// public class java16 {
//     public static void main(String[] args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//      ListIterator<Integer> it=list.listIterator();
//      while(it.hasNext()){
//         Integer x=it.next();
//         if(x==4){
//         it.add(4)    ;
//        it.add(3);
//        it.add(2);
//          it.add(1);
//         }
//      }
//      System.out.println(list);
//     }
// }    



import java.util.*;
public class java16 {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(16);
     ListIterator<Integer> it=list.listIterator();
     int target=14;
     while(it.hasNext()){
        
        if(it.next()<target){
       it.remove();
       
        }
     }
     System.out.println(list);
    }
}    

