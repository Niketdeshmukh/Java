package Hashing;

import java.util.HashSet;

public class PangramOrNot {
    public static boolean isPangram(String sentence){
        HashSet<Character> set=new HashSet<>();
        int L=sentence.length();
        if (L<26) return false;
        for (int i = 0; i <L ; i++) {
            set.add(sentence.charAt(i));
        }
        if (set.size()<26) return false;
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));
    }
}
