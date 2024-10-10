package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.modal.Car;
import web.service.CarService;
import java.util.List;


@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> aCars = carService.getCars(count);
        model.addAttribute("cars", aCars);
        return "cars";
    }
}
