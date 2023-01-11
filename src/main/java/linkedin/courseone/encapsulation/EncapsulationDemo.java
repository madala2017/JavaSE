package linkedin.courseone.encapsulation;
/**
 *  make sure the varaibles can be changed through accessor methods
 *  binding data with methods
 */

class Student {
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return getName() + " " + getRollno();
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("My Student Name");
        student.setRollno(23456787);
        System.out.println(student.toString());
    }
}
