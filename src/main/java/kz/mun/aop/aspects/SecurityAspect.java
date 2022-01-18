package kz.mun.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("kz.mun.aop.aspects.MyPointcuts.allAddMethods()") //pointcut
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: check for getting books or magazines");
        System.out.println("-------------------------------");
    }
}
