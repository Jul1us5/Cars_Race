
public class Truck extends Car {
    
    private int weight;
    
    public Truck(String name, int weight) {
        super(name, weight);
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
}
