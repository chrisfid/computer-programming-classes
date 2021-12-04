public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    
    public String toString() {
        return super.toString() + "\n" +
        "Minutes: " + getMinutes() + "\n" +
        "Seconds: " + getSeconds();
    }
    
    public int getMinutes() {
        return this.minutes;
    }
    
    public void setMinutes(int newMinutes) {
        this.minutes = newMinutes;
    }
    
    public int getSeconds() {
        return this.seconds;
    }
    
    public void setSeconds(int newSeconds) {
        this.seconds = newSeconds;
    }

    public void display() {
        System.out.println(this.toString());
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "JKR");
        // Ebook eb1 = new Ebook("Cosy Cat", "Julia K", "cosy_cat.epub");
        System.out.println("____________");
        b1.display();
        System.out.println("____________");
        Audiobook ab1 = new Audiobook("How to read faster", "John M.", 180, 55);
        ab1.display();
        System.out.println("____________");
        Audiobook ab2 = new Audiobook("How to speak louder", "John M.", 180, 55);
        ab1.display();
        System.out.println("____________");
        Book book3 = new Ebook("America", "Christopher A.", "america.epub");
        book3.display();
    }
    
    
}
