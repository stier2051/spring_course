package kz.mun.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
    public void getBook() {
        System.out.println("We take book from uni library ");
        System.out.println("-------------------------------");
    }

    public String returnBook() {
        int i = 10/0;
        System.out.println("we return book to uni library");
        return "Philosophy Java";
    }

    public void getMagazine() {
        System.out.println("we take magazine from uni library");
        System.out.println("-------------------------------");
    }

    public void returnMagazine() {
        System.out.println("we return magazine");
        System.out.println("-------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("we add book to uni library");
        System.out.println("-------------------------------");
    }

    public void addMagazine() {
        System.out.println("we add magazine to uni library");
        System.out.println("-------------------------------");
    }
}
