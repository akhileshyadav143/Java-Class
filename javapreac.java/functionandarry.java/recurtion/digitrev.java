public class digitrev {

    static int rev = 0;   // make it static

    static int reverse(int n) {
        if (n == 0) {
            return rev;
        }

        rev = rev * 10 + n % 10;
        return reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 123;

        int result = reverse(n);   // store result
        System.out.println(result);
    }
}

    
