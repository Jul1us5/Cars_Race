
public class SuperCar extends Car {

    private boolean spoiler;
    private boolean SuperCar;
    private String type;

    public SuperCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.spoiler = true;
        this.type = "Super";
    }

    public String getSpoiler() {
        if (this.getSpeed() > 100) {
            return "+";
        } else {
            return "-";
        }
    }

    public String getType() {
        return type;
    }
}
