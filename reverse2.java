public class reverse2 {
    public static void main(String[] args){
        String s1="Think Twice";
        String s2="";
        System.out.println(s1);

        String []s3 = s1.split(" ");

        for(String s: s3) {
            for(int i = s.length()-1; i>=0; i--) {
                s2 = s2 + s.charAt(i);
            }
            s2 = s2 +" ";
        }
        System.out.println(s2);

    }

}

