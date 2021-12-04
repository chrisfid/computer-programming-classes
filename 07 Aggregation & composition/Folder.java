import java.util.ArrayList;

public class Folder
{
    String name;
    String location;
    int size;
    ArrayList<File> files;
    
    public Folder(String name, String location) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.size = 1;
        this.files = new ArrayList<File>();
    }
     
    public String toString() {
        return this.location + "/" + this.name + "/";
    }
    
    public static void main(String[] args) {
        Folder folder1 = new Folder("Docs", "Users/user/Desktop");
        folder1.files.add(new File("english1", "txt", 16));
        folder1.files.add(new File("deutsch6", "txt", 32));
        System.out.println(folder1);
        folder1.files.add(new File("espanol4", "txt", 64));
        System.out.println(folder1);
        for (File file : folder1.files) {
            if (file.name == "deutsch6") {
                folder1.files.remove(file); 
            }
        }
        System.out.println(folder1.files);
    }
}
