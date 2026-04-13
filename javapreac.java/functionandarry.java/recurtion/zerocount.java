public class zerocount {

    static int countZero(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 0) {
            return 1 + countZero(n / 10);
        }

        return countZero(n / 10);
    }

    public static void main(String[] args) {
        int n = 1020304050;
        System.out.println(countZero(n));
    }
}