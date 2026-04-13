public class arraymax {

    static int findMax(int arr[], int i) {
        // base case: last element
        if (i == arr.length - 1) {
            return arr[i];
        }

        // recursive call
        int maxRest = findMax(arr, i + 1);

        // compare current with rest
        return (arr[i] > maxRest) ? arr[i] : maxRest;
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 2, 9, 5};

        System.out.println("Max = " + findMax(arr, 0));
    }
}