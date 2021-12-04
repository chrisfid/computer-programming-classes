public class File
{
    String name;
    String extension;
    int size;
    
    public File(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }
    
    public String toString() {
        return this.name + "." + this.extension + " " + this.size + " bytes";
    }
}
