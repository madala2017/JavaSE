package linkedin.courseone.varags;

class Calc {
    public int add(int ... i) {
        int sum = 0;
        for (int k : i) {
            sum += k;
        }
        return sum;
    }
}

public class VaragsDemo {
    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.add(4,5,6,7,8));
    }
}
