package Programs150;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class TotalMarksAndPercentage {
//    static void totalmarks(maths,comp,eng){
//
//    }
    public static void main(String[] args) {
        System.out.println("Enter the marks of maths: ");
        Scanner sc = new Scanner(System.in);

        int maths =sc.nextInt();
        System.out.println("Enter the marks of computer: ");
        int comp = sc.nextInt();
        System.out.println("Enter the marks of english: ");
        int eng =sc.nextInt();

        int marks = maths+comp+eng;
        System.out.println("The total marks you got is: " + marks);

        int percentage = (maths+comp+eng)/300 * 100;
        System.out.println("The total Percentage you got is: " + percentage);


    }
}
