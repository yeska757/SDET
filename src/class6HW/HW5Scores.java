package class6HW;

import java.util.Scanner;

/*Write a program that will read three inputs of scores (quiz, midterm, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
public class HW5Scores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your quiz score: ");
        int quiz = scan.nextInt();
        System.out.println("Enter your midterm score: ");
        int midTerm = scan.nextInt();
        System.out.println("Enter your final score: ");
        int fin = scan.nextInt();

        int avg = (quiz + midTerm + fin) / 3;

        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 70 && avg < 90) {
            System.out.println("B");
        } else if (avg >= 50 && avg < 70) {
            System.out.println("C");
        } else if (avg < 50) {
            System.out.println("F");
        }
    }
}
