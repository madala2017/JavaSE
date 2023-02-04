package linkedin.courseone.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         *  Used anonymous classes
         *  Used lambda expressions
         * */
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("Bye");
    }
}
