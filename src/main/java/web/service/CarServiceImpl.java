package web.service;
import org.springframework.stereotype.Service;
import web.modal.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<Car>();

    public CarServiceImpl() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Focus", 2018));
        cars.add(new Car("Chevrolet", "Malibu", 2021));
        cars.add(new Car("Nissan", "Altima", 2022));
    }

    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.subList(0, Math.min(count, cars.size()));
    }

}
