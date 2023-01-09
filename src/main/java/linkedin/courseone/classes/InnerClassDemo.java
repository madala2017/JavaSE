package linkedin.courseone.classes;

public class InnerClassDemo {
    public static void main(String[] args) {

        OuterClass obj = new OuterClass();
        obj.show();
        OuterClass.Inner obj2 = obj.new Inner();
        obj2.display();
    }
}
