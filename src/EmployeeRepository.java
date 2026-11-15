import java.util.List;

public interface EmployeeRepository {
//Создать метод репозиторий который будет находить всех сотрудников которые начинаются и заканчиваются словосочетание переданной через аргумент
    List<Employee> findEmployeeStartAnwWith(String name);
}
