package Lesson8.Bai10;

import java.util.Scanner;

public class Display {

    public static void menu(){
        System.out.println("\n===================================================================");
        System.out.println("1. Information of student");
        System.out.println("2. Information of staff");
        System.out.println("3. Information of customer");
        int selection;
        do{
            System.out.println("Enter your selection: ");
            selection = new Scanner(System.in).nextInt();
        }while (selection < 1 || selection > 3);

        if (selection == 1){
            Student giang;
            System.out.println("\n===================================================================");
//            Nhap ho ten, dia chi
            System.out.println("Enter the name: ");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Enter the address: ");
            String address = new Scanner(System.in).nextLine();

            giang = new Student(name, address);

//            Nhap diem
            System.out.println("Enter the score 1: ");
            double score = new Scanner(System.in).nextDouble();
            giang.setScore1(score);

            System.out.println("Enter the score 2: ");
            score = new Scanner(System.in).nextDouble();
            giang.setScore2(score);

//          Hien thi sinh vien
            System.out.println(giang);

//          Sua thong tin
            System.out.println("\n===================================================================");
            System.out.println("Do you want to change the the information of student?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int selection1;
            do {
                System.out.println("Enter your selection: ");
                selection1 = new Scanner(System.in).nextInt();
            }while (selection1 < 1 || selection1 > 2);
            if (selection1 == 1){
                giang.changeInformation();
                System.out.println("Information after changing \n" + giang);
            }
        }

        else if (selection == 2){
            Staff giang;
            System.out.println("\n===================================================================");
//            Nhap ho ten, dia chi
            System.out.println("Enter the name: ");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Enter the address: ");
            String address = new Scanner(System.in).nextLine();

            giang = new Staff(name, address);

//            Nhap luong
            System.out.println("Enter the salary: ");
            double salary = new Scanner(System.in).nextDouble();
            giang.setSalary(salary);

            System.out.println("Enter the position: ");
            String position = new Scanner(System.in).nextLine();
            giang.setPosition(position);

//          Hien thi nhan vien
            System.out.println(giang);

//          Sua thong tin
            System.out.println("\n===================================================================");
            System.out.println("Do you want to change the the information of staff?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int selection1;
            do {
                System.out.println("Enter your selection: ");
                selection1 = new Scanner(System.in).nextInt();
            }while (selection1 < 1 || selection1 > 2);
            if (selection1 == 1){
                giang.changeInformation();
                System.out.println("\nInformation after changing \n" + giang);
            }
        }

        else if (selection == 3){
            Customer giang;
            System.out.println("\n===================================================================");
//            Nhap ho ten, dia chi
            System.out.println("Enter the name: ");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Enter the address: ");
            String address = new Scanner(System.in).nextLine();

            giang = new Customer(name, address);

//            Nhap loai xe
            System.out.println("Enter the vehicle: ");
            String vehicle = new Scanner(System.in).nextLine();
            giang.setVehicle(vehicle);

            System.out.println("Enter the price: ");
            double price = new Scanner(System.in).nextDouble();
            giang.setPrice(price);

//          Hien thi hoa don
            System.out.println(giang);

        }
    }

    public static void main(String[] args) {
        while (true){
            menu();
//            Hoi xem co muon lam tiep khong
            System.out.println("\n===================================================================");
            System.out.println("\nDo you want to continue enter information?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int selection1;
            do {
                System.out.println("Enter your selection: ");
                selection1 = new Scanner(System.in).nextInt();
            }while (selection1 < 1 || selection1 > 2);
            if (selection1 == 2) {
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}
