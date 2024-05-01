package gforgtutorial.inputoutput.demo;

import java.util.Scanner;

public class ScannerDemoTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int rollNo;
        float marks;

        System.out.println("Enter your name");
        name = scanner.nextLine();

        System.out.println("Enter your roll no");
        rollNo = scanner.nextInt();

        System.out.println("Enter your marks");
        marks = scanner.nextFloat();
        System.out.println("Name : "+ name);
        System.out.println("RollNo : "+ rollNo);
        System.out.println("Marks : "+ marks);
    }
}
