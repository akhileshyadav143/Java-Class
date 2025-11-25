//  import java.util.ArrayList;
//  class main{
//     public static void main(String[] args){
//   ArrayList<Integer> list=new ArrayList<>();
// //           Linklist<Integer> list=new Linklist<>();
//          list.add(5);
//          list.add(10);
//          list.add(1,30);
//        System.out.println(list.get(1));

//      }
//  }

    

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class MyList {
//     Node head;

//     public void addToLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }
//         curr.next = newNode;
//     }

//     public void print() {
//         Node curr = head;
//         System.out.print("List of linked list: ");
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//         System.out.println();
//     }
// }

// public class Java12 {
//     public static void main(String[] args) {

//         MyList myList = new MyList();

//         myList.addToLast(10);
//         myList.addToLast(20);
//         myList.addToLast(30);
//         myList.addToLast(40);
//         myList.addToLast(50);

//         myList.print();
//     }
// }



