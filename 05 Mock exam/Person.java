public class Person
{
    private String name;
    private boolean adult;
    
    public Person(String name, boolean adult) {
        this.name = name;
        this.adult = adult;
        
        // setName(name);
        // setAdult(adult);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public boolean getAdult(boolean newAdult) {
        return this.adult;
    }
    
    public void setAdult(boolean newAdult) {
        this.adult = newAdult;
    }
}
