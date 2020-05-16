
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
                if (Math.random() <= 0.1) {
                    car.deceleration((int) (Math.random() * 4));
                } else {
                    car.acceleration((int) (Math.random() * 6));
                }
                car.start();
            }
            for (Car car : cars) {
                System.out.println(car.getName() + " " + car.getSpeed() + " " + car.getDistance());
            }
            arraySort(cars);
            System.out.println("--------");
        } while (cars[0].getDistance() < 200);
        System.out.println("WIN WIN: " + cars[0].getName());
    }

    public static void arraySort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int x = i + 1; i < cars.length; i++) {
                if(cars[i].getDistance() < cars[x].getDistance()) {
                    Car temp = cars[i];
                    cars[i] = cars[x];
                    cars[x] = temp;
                }
            }
        }
    }

}
