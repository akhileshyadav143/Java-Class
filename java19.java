// import java.rmi.server.ExportException;

// public class MyThread extends Thread{
//     public void run(){

//         System.out.println(Thread.currentThread().getName());
//         for(int i=0;i<=5;i++){
//            // System.out.println(i +"t1");
//            System.out.println("Downloading file..." +  (i*20)+ "%");
//             try{
//                 Thread.sleep(1000);
//             }catch(Exception e){

//             }
//         }
//     }
// }
// class java19{
//     public  static void main(String[] args){
//         MyThread t1=new MyThread();

//         t1.start();
//         for(int i=0;i<=5;i++){
//            // System.out.println(i +"t1");
//            System.out.println("timer..." +i );
//             try{
//                 Thread.sleep(2000);
//             }catch(Exception e){

//             }
//         try{
//             t1.join();
//         }catch(Exception e){

//         }
    
    
//       //  for(int i=0;i<5;i++){
//        //     System.out.println(i +"main");
//     }
// }
// }

class bank{
   int balance=100;
   synchronized void withdraw(int amt){
    System.out.println(Thread.currentThread().getName()+"");
    if(balance>=amt) {
        System.out.println(Thread.currentThread().getName());
        balance=balance-amt;
        System.out.println("Balance left:" + balance);
    }else{
        System.out.println("Not enough balance");
    }
    }
} 
class MyThread extends Thread{
    bank b;
    MyThread(bank b) {this.b = b; }

    public void run(){
        b.withdraw(100);
    }
}
public class java19{
public static void main(String[] args) {
    bank b =new bank();
    MyThread t1 =new MyThread(b);
    MyThread t2=new MyThread(b);
    t1.setName("om");
     t1.setName("Aman"  );
    t1.start();
    t2.start();
}
}