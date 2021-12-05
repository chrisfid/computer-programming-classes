public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(
        String title,
        Writer author,
        Publisher publisher,
        int releaseYear,
        int minutes,
        int seconds
    ) {
        super(title, author, publisher, releaseYear);
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
    
    /*
    public static void main(String[] args) {
        
        Publisher publisher1 = new Publisher("John K.", "Washington");
        Book b1 = new Book("Harry Potter", "JKR", publisher1);
        // Ebook eb1 = new Ebook("Cosy Cat", "Julia K", "cosy_cat.epub");
        System.out.println("____________");
        b1.display();
        System.out.println("____________");
        Audiobook ab1 = new Audiobook(
            "How to read faster",
            "John M.",
            publisher1,
            180,
            55
        );
        ab1.display();
        System.out.println("____________");
        Audiobook ab2 = new Audiobook(
            "How to speak louder",
            "John M.",
            publisher1,
            180,
            55
        );
        ab1.display();
        System.out.println("____________");
        Book book3 = new Ebook(
        "America the great nation",
        "Christopher A.",
        publisher1,
        "america_tgn.epub"
        );
        book3.display();
    }
    */
}
