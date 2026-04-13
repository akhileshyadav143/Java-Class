public class sumdigit {

    static int sumofdigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumofdigit(n / 10);
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(sumofdigit(n));
    }
}

