package linkedin.courseone.inheritance;


class A {
    public A() {
        System.out.println("In A");
    }
    public A(int i) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        //super(); // calls super by default
        System.out.println("In B");
    }
    public B(int i) {
        super(i);
        System.out.println("In B int");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("------------------------");
        B b1 = new B(5);
    }
}
