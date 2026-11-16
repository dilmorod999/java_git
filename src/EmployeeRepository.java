import java.util.List;

public interface EmployeeRepository {
    //Создать метод репозиторий который будет находить всех сотрудников которые начинаются и заканчиваются словосочетание переданной через аргумент
    List<Employee> findEmployeeStartAnwWith(String staring, String end);

    //Создать метод который будет находить самого дорогого сотрудника самый большой зарплатой и перенести все все буквы а его имени самое начало его имени
    Employee findEmployeeMaxPriceAndNameFirstA();

    //Создать метод который будет находить общее количество всех сотрудников которые начинаются на словосочетания переданной через аргумент имени имеет две буквы а
    int findEmployeeStartAA(String start);

    //    Создать метод который будет находить всех сотрудников по их должности если зарплата больше 10 000 то сделать их директорами
    List<Employee> findEmployeePositionifPrice(String position);

    //    Создать метод который будет находить всех сотрудников по их должности если зарплата будет меньше 5000 сделать их зарплату отрицательной
    List<Employee> findEmployeePositionPriceMinus(String position);
}
