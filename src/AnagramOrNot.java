import java.util.Arrays;
import java.util.Locale;

public class AnagramOrNot {
    public static void main(String[] args) {
        String str1 = "abrrc";
        str1=str1.toLowerCase();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        String str2 = "Car";
        str2=str2.toLowerCase();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
    if(str1.length()==str2.length()){
            if (Arrays.equals(ch1,ch2)){
                System.out.println("True");
            }
            else System.out.println("False");
        }
    else System.out.println("False");
    }
}
