package web.service;
import web.modal.Car;
import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
