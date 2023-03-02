package dao;

import car.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarDAO {

    private static int CAR_COUNT;
    private List<Car> cars;


    {
        cars.add(new Car(++CAR_COUNT,"Lexus","LX570"));
        cars.add(new Car(++CAR_COUNT,"Lexus","LX600"));
        cars.add(new Car(++CAR_COUNT,"Lexus","RX350"));
        cars.add(new Car(++CAR_COUNT,"Lexus","LS250"));
        cars.add(new Car(++CAR_COUNT,"Lexus","IS350"));

    }

    public List<Car> index() {
        return cars;
    }
    public Car show(int id) {
        return cars.stream().filter(car -> car.getId()==id).findAny().orElse(null);
    }
}
