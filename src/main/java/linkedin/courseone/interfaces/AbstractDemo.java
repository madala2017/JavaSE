package linkedin.courseone.interfaces;

interface Writer {
    void write();
    public static void test() {

    }
}

class Pen implements Writer {

    @Override
    public void write() {
        System.out.println("I'm a Pen");
    }
}

class Pencil implements Writer {

    @Override
    public void write() {
        System.out.println("I'm a Pencil");
    }
}

class Kit {
    public void doSomething(Writer writer) {
        writer.write();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Writer writer = new Pen();
        Kit kit = new Kit();
        kit.doSomething(writer);
    }
}
