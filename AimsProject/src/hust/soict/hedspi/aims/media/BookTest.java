package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<String> authors = new ArrayList<String>();
        authors.add("Ngo dieu");
        Book b = new Book("qq la co that", "sach tam ly", 25.5f, authors);
        b.setContent("song.-tren doi ? can co mot> tam long abc.abc def");
        System.out.println(b.toString());
    }
}
