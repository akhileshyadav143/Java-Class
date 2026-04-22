public class Aprint {
    static  int totalsum(String s, int i, boolean b){
        if(i==s.length()){
            return b?1:0;

        }
        int x=totalsum(s, i+1, b || s.charAt(i)=='a');
        int y=totalsum(s, i+1, b);
        return x+y;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(totalsum(s, 0, false));
    }
}
