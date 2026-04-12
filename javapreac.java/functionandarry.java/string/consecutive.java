//given a string of letter -> remive the consecutive letter and print it

public class consecutive{
    public static void main(String[] args) {
        String str="aabbbcccdd";
        String result="";
        for(int i=0;i<str.length();i++){
            if(i==0||str.charAt(i)!=str.charAt(i-1)){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}