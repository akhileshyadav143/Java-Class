public class arraycountkey {

    static int countKey(int arr[], int i, int key) {
        // base case
        if (i == arr.length) {
            return 0;
        }

        // if match → count +1
        if (arr[i] == key) {
            return 1 + countKey(arr, i + 1, key);
        }

        // otherwise skip
        return countKey(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 2, 5};
        int key = 2;

        System.out.println("Count = " + countKey(arr, 0, key));
    }
}