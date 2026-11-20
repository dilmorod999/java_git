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

    // Создать метод который будет находить самую дешёвую машину и возвращать её с балансом самой дорогой машины
    @Override
    public Cars findMinPriceMax() {
        Cars MinCar = cars.get(0);
        int min = cars.get(0).getPrice();
        Cars MaxCar = null;
        int max = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > max) {
                max = cars.get(i).getPrice();
                MaxCar = cars.get(i);
            }
            if (cars.get(i).getPrice() < min) {
                min = cars.get(i).getPrice();
                MinCar = cars.get(i);
            }
        }
        MinCar.setPrice(MaxCar.getPrice());
        return MinCar;
    }

    //Метод который будет вставлять в центр самой дорогой автомашины и его название название самый дешёвый автомашины
    @Override
    public Cars findCenterCarNameMinPrice() {
        Cars maxCar = null;
        int max = 0;
        Cars minCar = cars.get(0);
        int min = cars.get(0).getPrice();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > max) {
                max = cars.get(i).getPrice();
                maxCar = cars.get(i);
            }
            if (cars.get(i).getPrice() < min) {
                min = cars.get(i).getPrice();
                minCar = cars.get(i);
            }
        }
        String name = maxCar.getName();
        String fp = name.substring(0, name.length() / 2);
        String lp = name.substring(name.length() / 2);
        maxCar.setName(fp + minCar.getName() + lp);
        return maxCar;
    }
//Метод который будет находить и переворачивай все названия всех автомобилей в котором есть четное количество букв а и б и возвращать это из метода

    @Override
    public List<Cars> findCarReverseAB() {
        List<Cars> result = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            int amountA = 0;
            int amountB = 0;
            String name = cars.get(i).getName();
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'a') {
                    amountA++;
                }
                if (name.charAt(j) == 'b') {
                    amountB++;
                }
            }
            if (amountA % 2 == 0 && amountB % 2 == 0) {
                String empty = "";
                for (int j = name.length() - 1; j >= 0; j--) {
                    empty = empty + name.charAt(j);
                }
                cars.get(i).setName(empty);
                result.add(cars.get(i));
            }

        }
        return result;
    }
//    Который будет находить и переворачивать все цены автомобиль и возвращать именно цены автомобилей которые БУ

    @Override
    public List<Cars> findCarReversePriceBU() {
        List<Cars> result = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getBu() == true) {
                String price = cars.get(i).getPrice() + "";
                String empty = "";
                for (int j = price.length() - 1; j >= 0; j--) {
                    empty = empty + price.charAt(j);
                }
                cars.get(i).setPrice(Integer.parseInt(empty));
                result.add(cars.get(i));
            }
        }
        return result;
    }

    //    Метод который будет находить автомашину по ID и заменять его ID на самую дешёвую машину
    @Override
    public Cars findIdChangeMin(int id) {
        Cars found = null;
        int min = cars.get(0).getPrice();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                found = cars.get(i);
                break;
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() < min) {
                min = cars.get(i).getPrice();
            }

        }
        found.setPrice(min);
        return found;
    }

}