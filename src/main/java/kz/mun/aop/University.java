package kz.mun.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Alex Mun", 4, 7.5);
        Student st2 = new Student("John Smith", 2, 6.5);
        Student st3 = new Student("Felix Mueller", 1, 5.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("start method getStudents");
//        students.get(4);
        System.out.println("info from method get students:");
        System.out.println(students);
        return students;
    }
}
