package linkedin.courseone.inheritance;


class Calculator {

    public int add(int i, int j) {
        return (i+j);
    }
}

class CalcAdv extends Calculator {

    public int sub(int i, int j) {
        return (i-j);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(5,4);
        System.out.println(result);

        CalcAdv calcAdv = new CalcAdv();
        System.out.println(calcAdv.add(7,8));
        System.out.println(calcAdv.sub(9,4));
    }
}
