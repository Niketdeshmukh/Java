public class ReverseEachCharOfString {
    public static void main(String[] args) {
        String str = "NIKETDESHMUKH";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
