package linkedin.courseone.wrapperclasses;

public class WrapperDemo {


    public static void main(String[] args) {

        int i = 5;  // primitive data type
        Integer ii = new Integer(5);  // Boxing or wrapping

        int j = ii.intValue();    // unboxing or unwrapping

        Integer value = i;  // autoBoxing
        int k = value;    // autoUnboxing

    }
}
