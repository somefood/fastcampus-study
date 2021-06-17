package assign.chap06;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Book> arrayBook;

    public Student(String name) {
        this.name = name;
        arrayBook = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(String name) {
        Book book = new Book(name);
        arrayBook.add(book);
    }

    public void showBook() {
        System.out.print(name + " 학생이 읽은 책은: ");
        for(Book book: arrayBook) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();
    }
}
