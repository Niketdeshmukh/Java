public class ToggleEachAlphabet {
    public static void main(String[] args) {
        String str= "NikeT desHMukh";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str.charAt(i)=str.charAt(i).toUpperCase();
            }
        }
    }
}
