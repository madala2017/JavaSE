package linkedin.courseone.interfaces;

/**
 *  Types of interface
 *  1. Normal
 *  2. Single abstract method - functional Interface - lambda expression
 *  3. Marker interface has no method
 *  4.
 * */
interface Abc {
    void show();
}

class Implementor implements Abc {

    @Override
    public void show() {
        System.out.println("Anything ...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Abc abc = new Implementor();
        abc.show();
    }
}
