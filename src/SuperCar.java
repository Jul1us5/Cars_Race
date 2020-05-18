
public class SuperCar extends Truck {
    
    private boolean spoiler;
    
    public SuperCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.spoiler = true;
    }
}
