import java.util.Arrays;
public class sortString {
    static void sort(String str){
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
    public static void main(String[] args){
        String s = "cxrzaenvys";
        sort(s);
    }
}
