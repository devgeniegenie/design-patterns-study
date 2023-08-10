package designpatterns.creational_patterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student cj = new Student("cj");
        Student jh = new Student("jh");
        List<Student> students = new ArrayList<>();
        students.add(cj);
        students.add(jh);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
