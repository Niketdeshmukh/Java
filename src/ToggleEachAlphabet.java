public class ToggleEachAlphabet {
    public static void main(String[] args) {
        String str= "NikeT desHMukh";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str.charAt(i)=str.toUpperCase().charAt(i);
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str.charAt(i)=str.toLowerCase().charAt(i);
            }
        }
    }
}
