package Programs150;

public class ToggleEachAlphabet {
    public static void main(String[] args) {
        String str= "NikeT desHMukh";
        char a[]= str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(a[i]>='A' && a[i]<='Z')
            {
                a[i]=(char)((int)a[i]+32);
            }
            else if(a[i]>='a' && a[i]<='z')
            {
                a[i]=(char)((int)a[i]-32);
            }
        }
        for(char ch:a){
            System.out.print(ch);
        }
    }
}
