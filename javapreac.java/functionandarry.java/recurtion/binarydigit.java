public class binarydigit {

    public static void totalSum(String str, int n) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        totalSum(str + "0", n - 1);
        totalSum(str + "1", n - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        totalSum("", n);   // no space
    }
}