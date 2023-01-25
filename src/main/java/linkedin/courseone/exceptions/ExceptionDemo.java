package linkedin.courseone.exceptions;
/**
 *
 *
 * */




public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int [] a = new int[6];
            a[6] = 9;
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("Output is "+ k);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ");
            e.printStackTrace();
        } finally {
            System.out.println("Bye ...");
        }

    }
}
