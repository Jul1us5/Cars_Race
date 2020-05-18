
/**
 *
 * @author Julius
 */
public class Car {

    private String name;
    private int maxSpeed;
    private int speed;
    private int distance;
    private String type;
    private boolean spoiler;
    public int weight;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.distance = 0;
        this.type = "Sport";
//        this.spoiler = false;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public String getType() {
        return type;
    }

    public String getSpoiler() {
        return "-";
    }
    
        public int getWeight() {
        return weight;
    }

    public void acceleration(int kiek) {
        this.speed += kiek;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    public void deceleration(int kiek) {
        this.speed -= kiek;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public void start() {
        this.distance += this.speed;
    }
    
    

}
