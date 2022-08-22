import java.util.Locale;

public class CountVowelAndConsonent {
    public static void main(String[] args) {
        String str = "Hello my name is Niket Deshmukh";
        str = str.toLowerCase();
        int vCount=0,cCount=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            vCount++;

         else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("The no of vowel are : " + vCount);
        System.out.println("The no of consonant are: " +cCount);
    }
}
