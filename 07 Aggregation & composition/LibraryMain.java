public class LibraryMain
{
    public static void main(String[] args) {
        Writer author = new Writer("Bruce", "Eckel");
        Book book1 = new Book(
            "Thinking in Java",
            "WE publish",
            30,
            author
            );
        Book book2 = new Book(
            "Thinking in C++",
            "WE publish",
            25,
            author
            );
        
        book1.addChapter("Introduction", 10, 1);
        book1.addChapter("Variables", 10, 11);
        book1.addChapter("Conditional Statements", 10, 21);
        Bookcase bookcase1 = new Bookcase();
        bookcase1.books.add(book1);
        bookcase1.books.add(book2);
        System.out.println(bookcase1);
    }
}
