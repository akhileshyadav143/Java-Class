public class slidingwindow {
   
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        
        // Agar array ki size window se hi chhoti ho
        if (n < k) {
            System.out.println("Invalid: Array chhota hai!");
            return -1; 
        }

        int windowSum = 0;
        
        // Step 1: Pehle 'k' elements ka sum nikaal lo (Pehli window)
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        // Step 2: Window ko array ke end tak slide karo
        for (int i = k; i < n; i++) {
            // Naya sum = Purana Sum + Naya element - Piche chhutne wala element
            windowSum = windowSum + arr[i] - arr[i - k];
            
            // max_sum ko update karo agar current window ka sum bada hai
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        
        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum Sum hai: " + result);
    
}
}
