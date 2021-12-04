public class Book
{
    private String title;
    private String author;
    
    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }
    
    public String toString() {
        return (
            "Title: " + getTitle() + "\n" + 
            "Author: " + getAuthor()
        );
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    
    public void display() {
        System.out.println(this.toString());
    }
}
