public class Book
{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int releaseYear;
    
    public Book(
        String title,
        Writer author,
        Publisher publisher,
        int releaseYear
    ) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setReleaseYear(releaseYear);
    }
    
    public String toString() {
        return (
            "Title: " + getTitle() + "\n" + 
            getAuthor() + "\n" +
            getPublisher()
        );
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public Writer getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Writer newAuthor) {
        this.author = newAuthor;
    }
    
    public Publisher getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(Publisher newPublisher) {
        this.publisher = newPublisher;
    }
    
    public int getReleaseYear() {
        return this.releaseYear;
    }
    
    public void setReleaseYear (int newYear) {
        this.releaseYear = newYear;
    }
    
    public void display() {
        System.out.println(this.toString());
    }
}
