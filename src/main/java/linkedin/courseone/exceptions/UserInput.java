package linkedin.courseone.exceptions;

/**
 * checked exception is when the compiler knows about the exception
 * unchecked exception is the compiler does not know about the exception => that is All runtime exceptions or subclasses of RuntimeException
 *
 *
 *
 * RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
 * RuntimeException and its subclasses are unchecked exceptions. Unchecked exceptions do not need to be declared in a method
 * or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
 *
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int n = 0;
        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            n = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println(e);
            //throw new RuntimeException(e);
        }
        System.out.println(n);
    }
}
