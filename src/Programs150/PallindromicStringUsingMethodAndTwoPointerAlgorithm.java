package Programs150;

public class PallindromicStringUsingMethodAndTwoPointerAlgorithm {
    public static boolean CheckPalindrome(String str) {
        int i =0,j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Nen";
        str = str.toLowerCase();
        System.out.println(CheckPalindrome(str));
    }
}
