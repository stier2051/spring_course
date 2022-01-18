package kz.mun.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

//    @Override
    public void getBook() {
        System.out.println("we take book from school library");
    }
}
