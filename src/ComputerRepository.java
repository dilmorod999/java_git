import java.util.List;

public interface ComputerRepository {
//Метод который будет находить все компьютеры в которых есть четное количество букв а в первый и во второй половине его названия
    List<Computer> findFirstLastPart();
//    Метод который будет находить общую сумму всех компьютеров с чётной ценой который заканчивается на ноль
    int findTotolPriceLastZero();
//    Метод который будет находить все компьютеры БУ и делать их новыми если цена будет больше 1000
    List<Computer> findBuNewMore1000();
}
