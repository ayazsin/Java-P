package car;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", "ES-456-FW"));
        cars.add(new FamilyCar("Volkswagen", "Touran", "PT-345-JH",7));
        cars.add(new SportCar("Porsche", "Carerera", "EX-567-ZA", 350));

        for (Car elt : cars) {
            elt.move();
            System.out.println(elt);
        }

    }
}
