package linkedin.courseone.methooverriding;

class A {

    public void show() {
        System.out.println("In A");
    }
}

class B extends A {

    @Override
    public void show() {
        //super.show();
        System.out.println("In B");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {

        B b = new B();
        b.show();
    }
}
