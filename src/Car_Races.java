/**
 *
 * @author Julius
 */
public class Car_Races {

    public static void main(String[] args) {
        
        
        Car[] cars = {
        new Car("Audi", 200),
        new Car("Bmw", 200),
        new Car("Ferrai", 200),
        new Car("Toyota", 200),
        new Car("Skoda", 200)        
        };
        
        do {
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                if(Math.random() <= 0.2 ) {
                    car.deceleration((int) (Math.random() * 4));
                } else {
                    car.acceleration((int) (Math.random() * 6));
                }
                car.start();
            }
            for(Car car : cars) {
                System.out.println(car.getName() + " " + car.getSpeed() + " " + car.getDistance());
            }
            
        } while (true);
        
        
        
        
    }
    
}
