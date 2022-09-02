package Programs150;

public class CapitalizeFirstCharOfString {
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
        message = String.valueOf(ch);
        System.out.println("Message: " + message);
        }
    }
