package linkedin.courseone.classes;

/*
* Inner class
* Member class
* Static class
* Anonymous class
*
* */
public class OuterClass {

    private int a;
    public void show() {
        System.out.println("Showing");
    }

    class Inner {
        public void display() {
            System.out.println("In dissplay");
        }
    }
}
