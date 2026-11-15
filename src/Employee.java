public class Employee {
    private Integer id;
    private int salary;
    private String name;
    private String position;
    private String insuranceNumber;

    Employee(Integer id, int salary, String name, String position, String insuranceNumber) {
        this.id = id;
        this.salary=salary;
        this.name=name;
        this.position=position;
        this.insuranceNumber=insuranceNumber;
    }

    public Integer getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }
}
