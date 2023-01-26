package linkedin.courseone.threads;

class A {

}

public class MyThread  extends A implements Runnable {

    int [] values = {6,5,1,7,8};

    public void run() {
        for (int i = 0; i < 5; i++) {
            values[i] = values[i] * 2;
        }
    }
}
