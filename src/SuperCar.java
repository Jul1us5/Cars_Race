
public class SuperCar extends Car {
    
    private String spoiler;
    private boolean SuperCar;
    private String type;
    
    public SuperCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.spoiler = spoiler;
        this.SuperCar = true;
        this.type = "Super";
    }
    
    public String getSpoiler() {
        if(this.getSpeed() > 100) {
            return "+";
        } else {
            return "-";
        }
    }
    public boolean getSuper() {
        return SuperCar;
    }
    public String getType() {
        return type;
    }
}
