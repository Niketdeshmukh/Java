package Programs150;

public class CheckFirstLetterIsCapitalOrNot {
    public static void main(String[] args) {
        String message = "everyone loves java";
        char ch[] = message.toCharArray();
        boolean foundSpace=true;
        boolean result=true;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])){
                if (foundSpace){
                    result=Character.isUpperCase(ch[i]);
                    foundSpace=false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        System.out.println(result);
        message = String.valueOf(ch);
        System.out.println("Message: " + message);
    }
}
