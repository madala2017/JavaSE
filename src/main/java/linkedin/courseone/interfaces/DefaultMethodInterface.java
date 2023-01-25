package linkedin.courseone.interfaces;

interface Demo {
    void abc();
    default void show() {
        System.out.println("in show");
    }
}

class DemoImp implements Demo {

    @Override
    public void abc() {
        System.out.println("in abc ");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Demo demo = new DemoImp();
        demo.abc();
        demo.show();
    }
}
