import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImple implements  EmployeeRepository{
    List<Employee> employees;

    EmployeeRepositoryImple(List<Employee> employees){
        this.employees=employees;
    }

    public List<Employee> employees(){
        return employees;
    }
//Создать метод репозиторий который будет находить всех сотрудников которые начинаются и заканчиваются словосочетание переданной через аргумент
    @Override
    public List<Employee> findEmployeeStartAnwWith(String name) {
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i <employees.size() ; i++) {
            String FirstName = employees.get(i).getName().substring(0,1);
            String LastName = employees.get(i).getName().substring(employees.get(i).getName().length()-1);
            if (FirstName.equals(name) && LastName.equals(name)){
                result.add(employees.get(i));
            }
        }
        return result;
    }
}
