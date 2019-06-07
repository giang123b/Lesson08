package Lesson8.Bai10;

import java.util.Scanner;

public class Staff extends Person{
    double salary;
    String position;

    public Staff(String name, String address) {
        super(name, address);
    }

    public Staff() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String Salary(){// tinh luong
        return "Salary: " + (this.salary);
    }

    public void changeInformation(){// thay doi thong tin
        System.out.println("0. Change salary: ");
        System.out.println("1. Change position: ");
        System.out.println("2. Change all: ");
        int selection;
        do{
            System.out.println("Enter your selection: ");
            selection = new Scanner(System.in).nextInt();
        }
        while(selection < 0 || selection > 2);
        if(selection == 0){
            System.out.println("Enter the salary: ");
            double salary1 = new Scanner(System.in).nextDouble();
            this.salary = salary1;
        }
        else if(selection == 1){
            System.out.println("Enter the position: ");
            String position1 = new Scanner(System.in).nextLine();
            this.position = position1;
        }
        else if(selection == 2){
            System.out.println("Enter the salary: ");
            double salary1 = new Scanner(System.in).nextDouble();
            this.salary = salary1;

            System.out.println("Enter the position: ");
            String position1 = new Scanner(System.in).nextLine();
            this.position = position1;
        }
    }

    @Override
    public String toString() {
        System.out.println("\n===================================================================");
        return "\nName: " + this.name +
                "\nAddress: " + this.address +
                "\nPosition: " + this.position +
                "\nSalary: " + this.salary;
    }
}
