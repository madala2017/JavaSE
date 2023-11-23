package eightfeatures.methodreference.demo;

public class InstanceMethodReferenceTwo {

    public void printMsg() {
        System.out.println("Hello, this is instance method");
    }

    public static void main(String[] args) {

        Thread t = new Thread( new InstanceMethodReferenceTwo()::printMsg);

        t.start();
    }
}
