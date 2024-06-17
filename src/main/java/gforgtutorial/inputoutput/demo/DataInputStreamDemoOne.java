package gforgtutorial.inputoutput.demo;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemoOne {

    public static void main(String[] args) throws IOException {

        DataInputStream dataInputStream = new DataInputStream(System.in);

        System.out.println("Enter an integer : ");

        int inputInt = Integer.parseInt(dataInputStream.readLine());

        System.out.println("Enter a string : ");
        String inputString = dataInputStream.readLine();

        System.out.println("You entered integer : "+ inputInt);
        System.out.println("You entered string : "+inputString);


    }
}
