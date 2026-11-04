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

    //Создать метод который будет находить общую сумму всех автомобилей чей номер будет содержать две буквы а
    @Override
    public int findTotalPriceNumberAA() {
        int total = 0;
        for (int i = 0; i < cars.size(); i++) {
            int amount = 0;
            for (int j = 0; j < cars.get(i).getNumber().length(); j++) {
                if (cars.get(i).getNumber().charAt(j) == 'a') {
                    amount++;
                }
            }
            if (amount == 2) {
                total = total + cars.get(i).getPrice();
            }
        }
        return total;


    }

    //Создать метод который будет находить количество машин Bal будет содержать три нуля а длина номера машины будет больше 10
    @Override
    public int AmountBalance() {
        int amount = 0;
        int amountBalance = 0;
        for (int i = 0; i < cars.size(); i++) {
            String balance = cars.get(i).getPrice() + "";
            for (int j = 0; j < balance.length(); j++) {
                if (balance.charAt(j) == '0') {
                    amountBalance++;
                }
            }
            if (amountBalance == 3) {
                if (cars.get(i).getNumber().length() > 10) {
                    amount++;
                }
            }
        }
        return amount;
    }
}