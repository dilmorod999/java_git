import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImple implements EmployeeRepository {
    List<Employee> employees;

    EmployeeRepositoryImple(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> employees() {
        return employees;
    }

    //Создать метод репозиторий который будет находить всех сотрудников которые начинаются и заканчиваются словосочетание переданной через аргумент
    @Override
    public List<Employee> findEmployeeStartAnwWith(String start, String end) {
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().startsWith(start)
                    && employees.get(i).getName().endsWith(end)) {
                result.add(employees.get(i));
            }
        }
        return result;
    }

    //Создать метод который будет находить самого дорогого сотрудника самый большой зарплатой и перенести все все буквы а его имени самое начало его имени
    @Override
    public Employee findEmployeeMaxPriceAndNameFirstA() {
        Employee found = null;
        Employee maxEmpl = null;
        int max = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > max) {
                max = employees.get(i).getSalary();
                maxEmpl = employees.get(i);
            }
        }
        String name = maxEmpl.getName();
        String aaa = "";
        String empty = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                aaa = aaa + "a";
            } else {
                empty = empty + name.charAt(i);
            }
        }
        maxEmpl.setName(aaa + empty);
        return maxEmpl;
    }

    //Создать метод который будет находить общее количество всех сотрудников которые начинаются на словосочетания переданной через аргумент имени имеет две буквы а
    @Override
    public int findEmployeeStartAA(String start) {
        int totalAmount = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().startsWith(start)) {
                int countA = 0;
                String name = employees.get(i).getName();
                for (int j = 0; j < name.length(); j++) {
                    if (name.charAt(j) == 'a') {
                        countA++;
                    }
                }
                if (countA == 2) {
                    totalAmount++;
                }
            }
        }
        return totalAmount;
    }

    //    Создать метод который будет находить всех сотрудников по их должности если зарплата больше 10 000 то сделать их директорами
    @Override
    public List<Employee> findEmployeePositionifPrice(String position) {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getPosition().equals(position) &&
                    employees.get(i).getSalary() > 10000) {
                employees.get(i).setPosition("DIRECTOR");
                list.add(employees.get(i));
            }
        }
        return list;
    }
    //    Создать метод который будет находить всех сотрудников по их должности если зарплата будет меньше 5000 сделать их зарплату отрицательной

    @Override
    public List<Employee> findEmployeePositionPriceMinus(String position) {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getPosition().equals(position) && employees.get(i).getSalary() < 5000) {
                employees.get(i).setSalary(-employees.get(i).getSalary());
                list.add(employees.get(i));
            }
        }
        return list;
    }
//Создать метод который будет находить все сотрудников и ставить все буквы а в начало его имени а буквы б в конец

    @Override
    public List<Employee> findEmployeeAfirstBlast() {
        List<Employee> resultList = new ArrayList<>();
        // papabebe -> aappeebb
        for (int i = 0; i < employees.size(); i++) {
            String resultName = "";
            String aaa = "";
            String bbb = "";
            String name = employees.get(i).getName();
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) != 'a' && name.charAt(j) != 'b') {
                    resultName = resultName + name.charAt(j);
                } else if (name.charAt(j) == 'a') {
                    aaa = aaa + 'a';
                } else {
                    bbb = bbb + 'b';
                }
            }
            employees.get(i).setName(aaa + resultName + bbb);
            resultList.add(employees.get(i));
        }
        return resultList;
    }

    //    Создать метод который найдет сотрудника по айди и сделает его зарплату отрицательной и уберет все цифры 1 и 4
    @Override
    public Employee findEmployeeIdSalaryNegativeDelete14(int id) {
        Employee found = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.get(i).setSalary(-employees.get(i).getSalary());
                String empty = "";
                String salary = employees.get(i).getSalary() + "";
                for (int j = 0; j < salary.length(); j++) {
                    if (salary.charAt(j) != '1' && salary.charAt(j) != '4') {
                        empty = empty + salary.charAt(j);
                    }
                }
                employees.get(i).setSalary(Integer.parseInt(empty));
                found = employees.get(i);
            }
        }
        return found;
    }

    //    Создать метод который увеличит зарплату каждого сотрудника если он или менеджер или строитель
    @Override
    public List<Employee> findInsSalaryEmployeeIfManagerOReng() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getPosition().equals("Manager") || employees.get(i).getPosition().equals("Builder")) {
                employees.get(i).setSalary(employees.get(i).getSalary() * 10);
                employeeList.add(employees.get(i));
            }
        }
        return employeeList;
    }

    //    Создать метод который вернет все зарплаты сотрудников без нулей
    @Override
    public List<Employee> findReturnSalaryWithOut0() {
        List<Employee> result = new ArrayList<>();
        String empty = "";
        for (int i = 0; i < employees.size(); i++) {
            String salary = employees.get(i).getSalary() + "";
            for (int j = 0; j < salary.length(); j++) {
                if (salary.charAt(j) != '0') {
                    empty = empty + salary.charAt(j);
                }
                employees.get(i).setSalary(Integer.parseInt(empty));
                result.add(employees.get(i));
            }
        }

        return result;
    }

    //    Создать метод который вернет все имена сотрудников чья зарплата будет больше 1000 и должность менеджер
    @Override
    public List<Employee> findSalaryMost1000AndPositionManager() {
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > 1000) {
                employees.get(i).setPosition("Manager");
                result.add(employees.get(i));
            }
        }
        return result;
    }
}