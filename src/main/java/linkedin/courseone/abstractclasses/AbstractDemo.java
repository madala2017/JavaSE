package linkedin.courseone.abstractclasses;

/***
 *  Why abstract classes
 *
 * */
abstract class Human {

    public abstract void eat() ;
    public void walk() {

    }
}

class Man extends Human {

    @Override
    public void eat() {

    }
}

class Printer {

    public void show(Number i) {         // Number is an abstract class and parent class to Integer, Double, etc
        System.out.println(i);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        //Human human = new Man();

        Printer printer = new Printer();
        printer.show(5.6);
        printer.show(10);
    }
}
