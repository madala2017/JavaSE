package linkedin.courseone.classes;

class Casio {
    public void add(int i, int j) {
        System.out.println(i+j);
    }
    public void add(int i, int j, int k) {
        System.out.println(i+j+k);
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Casio casio = new Casio();
        casio.add(5,2);
        casio.add(4,3,5);
    }
}
