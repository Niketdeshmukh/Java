package Programs150;

import java.util.Scanner;

public class GradeOfMarksObtained {
    public static void main(String[] args) {
        System.out.println("Enter the marks : ");

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();


        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        } else if (marks <= 40) {
            System.out.println("F");

        }
    }}
