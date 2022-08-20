import java.util.Locale;

public class StringIsPallindromeOrNot {
    public static boolean main(String [] args){

        String str = "Nen";
        int i =0,j=str.length()-1;
        str = str.toLowerCase();
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
}
