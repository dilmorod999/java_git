import java.util.List;

public interface ComputerRepository {
//Метод который будет находить все компьютеры в которых есть четное количество букв а в первый и во второй половине его названия
    List<Computer> findFirstLastPart();
}
