public class Writer
{
    String firstName;
    String lastName;
    String literaryGenre;
    
    public String toString() {
        return (
        "Author: (" + literaryGenre + ") " +
        getFirstName() + " " +
        getLastName()
        );
    }
    
    public Writer(
        String firstName,
        String lastName,
        String literaryGenre
        ) {
        setFirstName(firstName);
        setLastName(lastName);
        setLiteraryGenre(literaryGenre);
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String newName) {
        this.firstName = newName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public String getLiteraryGenre() {
        return this.literaryGenre;
    }
    
    public void setLiteraryGenre(String newGenre) {
        this.literaryGenre = newGenre;
    }
}
