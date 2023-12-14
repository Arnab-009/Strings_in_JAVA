public class removeChar {
    public static void main(String[] args){
        String str = "Java Programming";
        System.out.println(str);
        System.out.println(remove(str,4)); //to remove space character
    }
    public static String remove(String s, int position){
        return s.substring(0,position) + s.substring(position+1);
    }
}
