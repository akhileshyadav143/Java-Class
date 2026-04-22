public class String2no {

    static void totalSum(String p, String up, int k) {

        // base condition
        if (p.length() == k) {
            System.out.println(p);
            return;
        }

        if (up.isEmpty()) return;

        char ch = up.charAt(0);

       
        totalSum(p + ch, up.substring(1), k);
        totalSum(p, up.substring(1), k);
    }
    public static void main(String[] args) {
        String up = "abc";
        int k = 2;
        totalSum("", up, k);
    }
}