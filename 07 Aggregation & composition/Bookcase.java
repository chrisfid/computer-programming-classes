import java.util.ArrayList;

public class Bookcase
{
    ArrayList<Book> books = new ArrayList<Book>();
    
    public String toString() {
        String res = "Books in this bookcase: \n";
        for (Book book : books) {
            res += ("- " + book + " ");
            res += "\n";
        }
        return res;
    }
}
    