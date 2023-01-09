package linkedin.courseone.classes;

class Emp {
    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "Larry";
    }
    public Emp() {
        eid = 1;
        salary = 30000;
    }
    public void show() {
        System.out.println(eid +" : "+ salary +" : "+ ceo);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 40000;

        Emp defaultEmp = new Emp();
        navin.show();
        defaultEmp.show();
    }
}
