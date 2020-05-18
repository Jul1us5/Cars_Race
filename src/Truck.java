
public class Truck extends Car {

    private String type;
    private Boolean spoiler;
    private int weight;

    public Truck(String name, int maxSpeed, int weight) {
        super(name, maxSpeed);
        this.weight = weight;
        this.type = "Truck";
        this.spoiler = false;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getSpoiler() {
        return "-";
    }
}
