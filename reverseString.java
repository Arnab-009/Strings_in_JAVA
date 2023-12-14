public class reverseString {
    public static void main(String[] args){
        String s1 = "PWSKILLS";
        String result = "";
        int len = s1.length();
        for (int i = len-1; i>=0; i--){
            char ch = s1.charAt(i);
            result = result + ch;
        }
        System.out.println("The original String: " + s1);
        System.out.println("The reverse String: " + result);
    }
}
