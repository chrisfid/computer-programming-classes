public class Book {
    String title;
    String publishingHouse;
    Writer author;
    int cost;
    
    public String toString() {
        return this.title + " " + this.author;
    }
    
    public Book(
        String title, 
        String publishingHouse,
        int cost,
        Writer author
        ) {
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.cost = cost;
        this.author = author;
    }
    
    public void open() {}
    public void close() {}
    
    public static void main(String[] args) {
        Writer author = new Writer("Bruce", "Eckel");
        Book book1 = new Book(
            "Thinking in Java",
            "WE publish",
            30,
            author
            );
    }
}