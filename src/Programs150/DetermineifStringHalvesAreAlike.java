package Programs150;

public class DetermineifStringHalvesAreAlike {
    public static boolean halvesString(String s){
        int count = 0;
        for(int i=0;i<s.length() / 2;i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c =='i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') count++;
        }
        for(int i=s.length() / 2;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c =='i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') count--;
        }
        return count == 0;
    }
    public static void main(String[] args) {
        String s = "boek";
        boolean result = halvesString(s);
        System.out.println(result);
    }
}