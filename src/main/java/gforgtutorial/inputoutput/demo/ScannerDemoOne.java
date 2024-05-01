package gforgtutorial.inputoutput.demo;

import java.util.Scanner;

public class ScannerDemoOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next(); // read one word string
        System.out.println("Entered string str1 : "+ str1);

        String str2 = scanner.nextLine(); // reads complete sentence
        System.out.println("Entered string str2 : "+ str2);

        int x = scanner.nextInt();
        System.out.println("Enter integer : "+ x);

        float f = scanner.nextFloat();
        System.out.println("Entered float value : "+ f);
    }
}
