package linkedin.courseone.finalkeyword;
/**
 *  Can be used at class level
 *  Can be used at method level
 *  Can be used with variable
 * */

class A {

    final int i = 5;
    public A() {
        //i = 20;  // cannot assign a value to a final variable
    }

    public void show() {
        System.out.println("In A");
    }
}
class B extends A {

    public void show() {
        System.out.println("In B");
    }
}
public class FinalKeyWordDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
    }
}
