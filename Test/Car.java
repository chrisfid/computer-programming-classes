// Compostion example

public class Car {

    private final Engine engine; 

    public Car(){
        System.out.println("Why don't I have an engine yet?");
        this.engine = new Engine();
    }
}