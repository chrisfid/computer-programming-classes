public class Publisher
{
    String name;
    String city;
    
    public String toString() {
        return "Publisher: " + getName();
    }
    
    public Publisher(String name, String city) {
        setName(name);
        setCity(city);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String newCity) {
        this.city = newCity;
    }
}
