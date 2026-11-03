import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImple implements CarRepository {
    private List<Cars> cars;

    CarRepositoryImple(List<Cars> cars) {
        this.cars = cars;
    }

    public List<Cars> cars() {
        return cars;
    }

    //Метод который будет находить самую дорогую машину переворачивайте номер если цена больше тыща долларов иначе ничего не делать и возвращать
    @Override
    public List<Cars> findMaxPriceReverseNumber() {
        List<Cars> result = new ArrayList<>();
        Cars maxCars = null;
        int max = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > 1000) {
                if (cars.get(i).getPrice() > max) {
                    max = cars.get(i).getPrice();
                    maxCars = cars.get(i);
                }
            }
        }
        String empty = "";
        for (int i = maxCars.getNumber().length() - 1; i >= 0; i--) {
            empty = empty + maxCars.getNumber().charAt(i);
        }
        maxCars.setNumber(empty);
        result.add(maxCars);
        return result;
    }
}
