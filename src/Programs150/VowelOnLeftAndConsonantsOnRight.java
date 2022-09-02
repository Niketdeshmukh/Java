package Programs150;

import java.util.Scanner;

public class VowelOnLeftAndConsonantsOnRight {
    String wrd,newwrd;
    static Scanner x=new Scanner(System.in);
    VowelOnLeftAndConsonantsOnRight(){}
    void readword()
    {
        System.out.println("Enter a word" );
        wrd=x.next();
        wrd=wrd.toUpperCase();
    }
    void freq_vow_con()
    {
        int s=0,s1=0;
        char ch;
        for(int i=0;i<wrd.length();i++) {
            ch=wrd.charAt(i);
            if("AEIOU".indexOf(ch)!=-1)
                s++;
        }
        s1= wrd.length()-s;
        System.out.println("vowels = "+ s);
        System.out.println("consonants = " + s1);
    }
    void arrange()
    {
        char ch;
        String p="",q="";
        for(int i=0;i<wrd.length();i++) {
            ch=wrd.charAt(i);
            if("AEIOU".indexOf(ch)!=-1)
                p +=ch;
            else
                q +=ch;
        }
        newwrd= p+q;
    }
    void display()
    {
        System.out.println("Original word = "+ wrd);
        System.out.println("Rearranged word = "+ newwrd);
    }
    public static void main(String[] args) {
        VowelOnLeftAndConsonantsOnRight obj=new VowelOnLeftAndConsonantsOnRight();
        obj.readword();
        obj.freq_vow_con();
        obj.arrange();
        obj.display();
    }
}