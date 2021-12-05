public class Ebook extends Book
{
    private String fileName;
    
    public Ebook(
        String title,
        Writer author,
        Publisher publisher,
        int releaseYear,
        String fileName
    ) {
        super(title, author, publisher, releaseYear);
        setFileName(fileName);
    }
    
    public String toString() {
        return super.toString() + "\nFile name: " + getFileName();
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String newFileName) {
        this.fileName = newFileName;
    }

    public void display() {
        System.out.println(this.toString());
    }
    
    /*
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("John K.", "Washington");
        Book b1 = new Book("Harry Potter", "JKR", publisher1);
        Ebook eb1 = new Ebook(
            "Cosy Cat",
            "Julia K",
            publisher1,
            "cosy_cat.epub"
        );
        Ebook eb2 = new Ebook(
            "Cosy Dog",
            "Amelia K",
            publisher1,
            "cosy_dog.epub"
        );
        System.out.println("____________");
        b1.display();
        System.out.println("____________");
        eb1.display();
        System.out.println("____________");
        eb2.display();
        System.out.println("____________");
    }
    */
}
