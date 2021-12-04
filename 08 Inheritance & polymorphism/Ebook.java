public class Ebook extends Book
{
    private String fileName;
    
    public Ebook(String title, String author, String fileName) {
        super(title, author);
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
    
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "JKR");
        Ebook eb1 = new Ebook("Cosy Cat", "Julia K", "cosy_cat.epub");
        Ebook eb2 = new Ebook("Cosy Dog", "Amelia K", "cosy_dog.epub");
        System.out.println("____________");
        b1.display();
        System.out.println("____________");
        eb1.display();
        System.out.println("____________");
        eb2.display();
        System.out.println("____________");
    }
}
