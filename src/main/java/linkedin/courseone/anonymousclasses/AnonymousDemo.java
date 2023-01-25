package linkedin.courseone.anonymousclasses;
/**
 * When the only purpose of a class is to override a method e.g class B is only overriding show method of class A
 *
 * */
class A {
    public void show() {
        System.out.println("In A show");
    }
}
class B extends A {
    public void show() {
        System.out.println("I'm the best");
    }
}
public class AnonymousDemo {
    public static void main(String[] args) {

        A a = new A() {
            public void show() {
                System.out.println("I'm the best unonymous");
            }
        };
        a.show();
    }
}
