package kz.mun.aop.aspects;

import kz.mun.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* kz.mun.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(public void kz.mun.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineAdvice() {
//        System.out.println("allMethodsExceptReturnMagazineFromUniLibrary(): Log #10");
//    }

//    @Pointcut("execution(* kz.mun.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* kz.mun.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice writing Log #3");
//    }

//    @Before("execution(public void getBook(*))") //pointcut
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: attempt to get book");
//    }

//    @Before("execution(public void get*())") //pointcut
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: attempt to get book");
//    }

//    @Before("execution(public * kz.mun.aop.UniLibrary.returnBook())") //pointcut
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: attempt to return book");
//    }

//    @Before("execution(public void *(*))") //pointcut для любого метода с любым одним параметром
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: attempt to get book");
//    }

//    @Before("execution(public void *(..))") //pointcut для любого метода с любым количеством параметров
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: attempt to get book");
//    }



    @Before("kz.mun.aop.aspects.MyPointcuts.allAddMethods()") //pointcut
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("MethodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("MethodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(
                            "Info about book: name - " + myBook.getName() +
                                    ", author - " + myBook.getAuthor() +
                                    ", year - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("book in library add - " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: logging - attempt to get book");
        System.out.println("-------------------------------");
    }

}
