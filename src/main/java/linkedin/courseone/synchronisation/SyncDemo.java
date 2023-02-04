package linkedin.courseone.synchronisation;

class Counter {
    int count;
    /**
     * Only one thread can work or use the method at a given time
     *
     * */
    public synchronized void increment() {
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count " + counter.count);
    }
}
