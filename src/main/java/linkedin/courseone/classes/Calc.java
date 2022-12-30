package linkedin.courseone.classes;

/*
*
* Object knows something and does something
*
* */

public class Calc {

    private int number1;
    private int number2;
    private int result;

    public Calc() {
        number1 = 5;
        number2 = 5;
    }
    public void perform() {
        result = number1 + number2;
        System.out.println("Value " + result);
    }
}
