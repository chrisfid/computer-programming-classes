public class Counter
{
    int count = 0;
    
    public void increase() {
        this.count++;
    }
    
    public void decrease() {
        this.count--;
    }
    
    public void increase(int n) {
        this.count += n;
    }
    
    public void decrease(int n) {
        this.count -= n;
    }
    
    public int value() {
        return count;
    }
}
