import java.util.List;

public interface CarRepository {
//    Метод который будет находить самую дорогую машину переворачивайте номер если цена больше тыща долларов иначе ничего не делать и возвращать
    List<Cars> findMaxPriceReverseNumber();
}
