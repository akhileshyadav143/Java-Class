public class arraysum {

    static int sumofdigitarray(int[] arr, int i) {
        if (i == arr.length) 
            return 0;   // base case

        return arr[i] + sumofdigitarray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;

        System.out.println(sumofdigitarray(arr, i));
    }
}