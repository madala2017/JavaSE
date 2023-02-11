package linkedin.courseone.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno;
    int marks;
    String name;

    public Student(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [ rollno = "+ rollno + " marks = "+ marks + " name = "+ name+ " ]";
    }

    @Override
    public int compareTo(Student s) {
        return marks > s.marks ? -1 : 1;
    }
}




public class CollectionDemoTwo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(23,45,"Mahesh"));
        list.add(new Student(25,50,"John"));
        list.add(new Student(27,26,"Sonny"));
        list.add(new Student(30,36,"Larry"));

        Collections.sort(list); // if you to sort a list of objects of a class, the class must implement Comparable interface
        for( Student student : list) {
            System.out.println(student);
        }
    }

}
