import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books;
    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        
        Publisher publisher1 = new Publisher("John K.", "Washington");
        Writer writer1 = new Writer("J. K.", "Rowling", "fantasy");
        Writer writer2 = new Writer("Julia", "Kowalski", "fiction");
        Writer writer3 = new Writer("John", "Johansson", "self-development");
        
        Book b1 = new Book(
            "Harry Potter",
            writer1,
            publisher1,
            2002
        );
        books.add(b1);
        
        Ebook eb1 = new Ebook(
            "Cosy Cat",
            writer2,
            publisher1,
            2021,
            "cosy_cat.epub"
        );
        books.add(eb1);
        
        Ebook eb2 = new Ebook(
            "Cosy Dog",
            writer2,
            publisher1,
            2020,
            "cosy_dog.epub"
        );
        books.add(eb2);
        
        Audiobook ab1 = new Audiobook(
            "How to read faster",
            writer3,
            publisher1,
            1995,
            180,
            55
        );
        books.add(ab1);
        
        Audiobook ab2 = new Audiobook(
            "How to speak louder",
            writer3,
            publisher1,
            2000,
            180,
            55
        );
        books.add(ab2);
        
        for (Book book : books) {
            System.out.println("\n____________________");
            book.display();
            System.out.println("____________________");
            
        }
    }
}
