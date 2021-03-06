package chap10.object;

class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }

    // 클론시 CLonable 인터페이스 Implemnt 필요
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지2", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str);

        Book book2 = (Book) book.clone();
        System.out.println(book2);
    }
}
