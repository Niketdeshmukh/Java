package Programs150;

public class eachcharOfStringInNewLine {
    public static void printCharInNewLine(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "NIKETDESHMUKH";
        printCharInNewLine(str);
    }
}
