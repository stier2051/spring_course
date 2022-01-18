package kz.mun.aop.aspects;

import kz.mun.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println(
//                "beforeGetStudentsLoggingAdvice: logging getStudentsList before method getStudents");
//
//    }
//
//    @AfterReturning(value = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String fullName = "Mr. " + firstStudent.getFullName();
//        firstStudent.setFullName(fullName);
//
//
//        System.out.println(
//                "afterReturningGetStudentsLoggingAdvice: logging getStudentsList after method getStudents");
//
//    }

//    @AfterThrowing(value = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging throwing exception " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging end of method getStudents or throwing exception");
    }
}
