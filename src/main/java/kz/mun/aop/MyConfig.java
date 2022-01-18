package kz.mun.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("kz.mun.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
