package Programs150;

import java.util.Scanner;

public class VowelOrConsonents {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character : ");
    char alpha = sc.next().charAt(0);

    if (alpha=='a' || alpha=='e' ||alpha=='i' ||alpha=='o' ||alpha=='u' || alpha=='A' ||alpha=='E' ||alpha=='I' ||alpha=='O' ||alpha=='U'){
        System.out.println("The entered character is vowel");
    }
    else{
        System.out.println("Entered character is consonant");
    }


    }
}
