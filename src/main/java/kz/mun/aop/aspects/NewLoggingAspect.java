package kz.mun.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: attempt to return book");

//        Long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception was catched" + e);
        }
//        Long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: successfully returned book");
//        System.out.println("aroundReturnBookLoggingAdvice: method time " + (end - begin) + " millisec");

        return targetMethodResult;
    }
}
