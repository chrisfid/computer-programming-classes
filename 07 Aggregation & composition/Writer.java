public class Writer
{
    String name;
    String surname;
    int noBooks;
    
    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String toString() {
        return this.name + " " + this.surname;
    }
    
    public void writeBook() { }
}
