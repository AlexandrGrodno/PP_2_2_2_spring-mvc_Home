package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    private static  List<Car> carList = new ArrayList<Car>();
    public void newCar(){
        carList.add(new Car("AUDI","A6",2));
        carList.add(new Car("BMW","X6",3));
        carList.add(new Car("Tesla","Model S",1));
        carList.add(new Car("Lexus","RX",2));
        carList.add(new Car("LADA","2107",22));
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", defaultValue="5") int count, ModelMap model){

//        messages.add("Hello!");
//        messages.add("I'm Car");
//        if (count >0 )messages.add(String.valueOf(count));
        model.addAttribute("messages",  Arrays.asList(new Car("AUDI","A6",2),new Car("AUDI","A6",2)));
        return "/cars";

    }
}
