public class oddeven {
      static void totalSum(int[] arr, int i,int sum,String curr){
        if(i==arr.length){
            if(sum%2==0){
                System.out.println(curr);
            }
            return;

        }
        totalSum(arr, i+1, sum+arr[i],curr+arr[i]);
        totalSum(arr, i+1, sum, curr);
      }
      public static void main(String[] args) {
        int[] arr={1,2,3};
        totalSum(arr, 0, 0, "");
      }
    
}
