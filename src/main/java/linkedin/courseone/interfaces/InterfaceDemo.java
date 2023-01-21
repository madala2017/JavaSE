package linkedin.courseone.interfaces;

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
