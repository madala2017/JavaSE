package gforgtutorial.inputoutput.demo;

import java.util.Scanner;

public class ScannerDemoThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        while (scanner.hasNextInt()) {

            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        if ( count > 0) {
            System.out.println("Mean : "+ (sum / count));
        } else {
            System.out.println("No integers were input. Mean cannot be calculated.");
        }

    }
}
