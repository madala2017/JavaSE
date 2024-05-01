package gforgtutorial.inputoutput.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemoTwo {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;

        System.out.println("Enter your name");
        try {
            name = reader.readLine(); // taking string input
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Name : "+ name);
    }
}
