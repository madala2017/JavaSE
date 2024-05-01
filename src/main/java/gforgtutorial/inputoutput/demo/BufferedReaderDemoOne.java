package gforgtutorial.inputoutput.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Taking user input using BufferedReader class
 * */
public class BufferedReaderDemoOne {
    public static void main(String[] args) throws IOException {

        // creating BufferedReader object, InputStreamReader converts bytes to stream of character

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // string reading internally
        String str = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Entered string : "+ str);
        System.out.println("Entered number : "+ number);
    }
}
