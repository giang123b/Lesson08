package Lesson8.Bai10;

import java.util.Scanner;

public class Student extends Person {
    double score1;
    double score2;

    public Student(String name, String address) {// Thay doi thong tin 1 sinh vien
        super(name, address);
    }

    public Student() {
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public String sumScore(){// Tinh Tong
        return "Sum score: " + (this.score1 + this.score2);
    }

    public void changeInformation(){
        System.out.println("0. Change test score 1: ");
        System.out.println("1. Change test score 2: ");
        System.out.println("2. Change all test score: ");
        int selection;
        do{
            System.out.println("Enter your selection: ");
            selection = new Scanner(System.in).nextInt();
        }
        while(selection < 0 || selection > 2);
        if(selection == 0){
            System.out.println("Enter the score 1: ");
            double score = new Scanner(System.in).nextDouble();
            this.score1 = score;
        }
        else if(selection == 1){
            System.out.println("Enter the score 2: ");
            double score = new Scanner(System.in).nextDouble();
            this.score2 = score;
        }
        else if(selection == 2){
            System.out.println("Enter the score 1: ");
            double score = new Scanner(System.in).nextDouble();
            this.score1 = score;

            System.out.println("Enter the score 2: ");
            score = new Scanner(System.in).nextDouble();
            this.score2 = score;
        }
    }

    @Override
    public String toString() {
        System.out.println("\n===================================================================");
        return "\nName: " + this.name +
                "\nAddress: " + this.address +
                "\nTest score 1: " + this.score1 +
                "\nTest score 2: " + this.score2 +
                "\n" + sumScore() ;
    }
}
