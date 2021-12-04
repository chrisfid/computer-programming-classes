public class Chapter
{
    String title;
    int pageCount;
    int startingPage;
    
    public Chapter(String title, int pageCount, int startingPage) {
        this.title = title;
        this.pageCount = pageCount;
        this.startingPage = startingPage;
    }
    
    public String toString() {
        return "Title: " + this.title + ", " + this.pageCount + " pages";
    }
}
