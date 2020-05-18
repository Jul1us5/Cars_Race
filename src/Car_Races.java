
/**
 *
 * @author Julius
 */
public class Car_Races {

    public static void main(String[] args) {

        Car[] cars = {
            new Car("Audi", 250),
            new Car("Bmw", 250),
            new Car("Subaru", 250),
            new Car("Opel", 250),
            new Car("Toyota", 250),
            new Car("Ferrai", 250),
            new Car("Niva", 250),
            new Truck("Volvo", 180, 4000),
            new Truck("Scania", 180, 7000),
            new SuperCar("Bugatti", 520),
            new SuperCar("McLaren", 490)
        };

        System.out.println(cars[2].getType() + cars[2].getWeight());

        do {
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];

//                if (car.getType() == "Super" && car.getSpeed() > 100) {
//                   car.getSpoiler(); 
//                }
                if (Math.random() < 0.3) {

                    if (car.getType() == "Super" && car.getSpeed() > 100) {
                        car.deceleration((int) (Math.random() * 4) * 2);
                    }

                    if (car.getType() == "Truck" && car.getWeight() >= 4000) {
                        car.deceleration((int) (Math.random() * 4) - 3);
                    } else if (car.getType() == "Truck" && car.getWeight() >= 7000) {
                        car.deceleration((int) (Math.random() * 4) - 5);
                    }

                    car.deceleration((int) (Math.random() * 4));

                } else {

                    if (car.getType() == "Super" && car.getSpeed() > 100) {
                        car.acceleration((int) (Math.random() * 6) * 2);
                    }
                    if (car.getType() == "Truck" && car.getWeight() >= 4000) {
                        car.acceleration((int) (Math.random() * 6) - 3);
                    } else if (car.getType() == "Truck" && car.getWeight() >= 7000) {
                        car.acceleration((int) (Math.random() * 6) - 5);
                    }

                    car.acceleration((int) (Math.random() * 6));

                }
                car.start();
            }
            arraySort(cars);
            System.out.println("-----------");
            for (Car car : cars) {
                System.out.println(" - " + car.getName() + " [" + car.getType() + "]" + "[" + car.getSpoiler() + "]" + car.getSpeed() + " " + car.getDistance());
            }

        } while (cars[0].getDistance() < 20000);
        System.out.println("-----Finish------");
        System.out.println(" ");
        System.out.println("[ WINER is:" + cars[0].getName() + " ]");
        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println("CAR | CAR TYPE | SPOILER | SPEED | DISTANCE ");
    }

    public static void arraySort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int x = i + 1; x < cars.length; x++) {
                if (cars[i].getDistance() < cars[x].getDistance()) {
                    Car temp = cars[i];
                    cars[i] = cars[x];
                    cars[x] = temp;
                }
            }

        }
    }

}
