import java.util.*;
public class palindrome {
    public static void main(String[] args){
        String str, result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome:");
        str = sc.nextLine();
        for(int i = str.length()-1; i>=0; i--)
            result += str.charAt(i);
        if (str.equals(result))
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
