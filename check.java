public class check {
    public static void main(String[] args){
        String str = "Umbrella";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') {
                System.out.println("e is present");
                break;
            }
        }
    }
}
