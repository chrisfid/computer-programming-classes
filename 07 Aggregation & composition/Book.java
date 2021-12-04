import java.util.ArrayList;

public class Book {
    String title;
    String publishingHouse;
    Writer author;
    int cost;
    ArrayList<Chapter> chapters;
    
    public String toString() {
        return this.title + " " + this.author + "\n" +
        "Chapters: " + this.chapters;
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
        this.chapters = new ArrayList<Chapter>();
    }
    
    public void addChapter(String title, int pageCount, int startingPage) {
        this.chapters.add(new Chapter(title, pageCount, startingPage));
    }
    
    public void open() {}
    public void close() {}
}