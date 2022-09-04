package Programs150;

public class CapatizeFirstCharAndInNewLine {
    public static void main(String[] args) {
        String message = "everyone loves java";
        char ch[] = message.toCharArray();
        boolean foundSpace=true;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])){
                if (foundSpace){
                    ch[i]=Character.toUpperCase(ch[i]);
                    foundSpace=false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' '){
                System.out.println();
            }
            System.out.print(ch[i]);
        }
    }
}
