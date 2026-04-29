// import java.util.*;
// public class Recution4 {
//     static int  minsteps(int n, int[] dp) {
//         if (n == 1)
//             return 0;

//         if (dp[n] != -1)
//             return dp[n];
//         int ans = minsteps(n - 1, dp);

//         if (n % 2 == 0){
//             ans = Math.min(ans,minsteps(n / 2, dp));
//         }
//         if (n % 3 == 0)
//            ans = Math.min(ans,minsteps(n / 3, dp));

//         dp[n]=1+ans;
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         System.out.println( minsteps(n, dp));
//     }
// }









// n=4 steps in count print no=1 ya 2



// import java.util.*;
// public class Recution4 {
//     static int  minsteps(int n, int[] dp) {
//     if(n==0) return 1;
//     if(n<0) return 0;
//     if(dp[n]!= 0)    return dp[n];
    
//     dp[n]=minsteps(n-1,dp)+minsteps(n-2,dp);
//     return dp[n];
//   }
// public static void main(String[] args){
//      int n=4;
//     int[] dp=new int[n+1];
//     Arrays.fill(dp,0);
//     System.out.println(minsteps( n,dp ));
//  }
// }



// array[2,3,4,9]



// import java.util.*;
// public class Recution4 {
//     static int  minsteps(int[] arr,, int i, int[] dp) {
//    if(i>=arr.length)  return 0;
//    if(dp[i]!=-1)  return dp[i];
//    int x=arr[i] + minsteps(arr,i+2,dp);
//    int y= minsteps(arr,i+1,dp);
//    dp[i]=Math.max(x,y);
//    return dp[i];
//     }
//     public static void main(String[] args){

    
//     int[] arr={2,1,4,9};
//     int[] dp=new int[arr.length];
//     Arrays.fill(dp,-1);
//     int i=0;
//     System.out.println(minsteps(arr,i,dp));
// }
// }


//  string given kiy=tnay base say likh saktay hai 
//str="12" \


import java.util.*;

public class Recution4 {

    static int solve(String str, int i, int[] dp) { 
        if (i == str.length()) return 1;
        if (str.charAt(i) == '0') return 0;    
        if (dp[i] != -1) return dp[i];
        int ans = solve(str, i + 1, dp);  
        if (i + 1 < str.length()) {
            int num = (str.charAt(i) - '0') * 10 + (str.charAt(i + 1) - '0');
            if (num >= 10 && num <= 26) {
                ans += solve(str, i + 2, dp);
            }
        }
        return dp[i] = ans;
    }
    public static void main(String[] args) {
        String str = "12";
        int[] dp = new int[str.length()];
        Arrays.fill(dp, -1);
        System.out.println( + solve(str, 0, dp));
    }
}




