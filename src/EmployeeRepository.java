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

    //Создать метод который будет находить все сотрудников и ставить все буквы а в начало его имени а буквы б в конец
    List<Employee> findEmployeeAfirstBlast();
    //    Создать метод который найдет сотрудника по айди и сделает его зарплату отрицательной и уберет все цифры 1 и 4
    Employee findEmployeeIdSalaryNegativeDelete14(int id);
//    Создать метод который увеличит зарплату каждого сотрудника если он или менеджер или строитель
    List<Employee> findInsSalaryEmployeeIfManagerOReng();
//    Создать метод который вернет все зарплаты сотрудников без нулей
    List<Employee> findReturnSalaryWithOut0();
//    Создать метод который вернет все имена сотрудников чья зарплата будет больше 1000 и должность менеджер
    List<Employee> findSalaryMost1000AndPositionManager();


}
