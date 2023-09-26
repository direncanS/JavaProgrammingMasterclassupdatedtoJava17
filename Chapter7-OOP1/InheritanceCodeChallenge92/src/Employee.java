public class Employee extends Worker {

    private String hireDate;

    private  long employeeId;
    private static int employeeNo;
    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}' + super.toString();
    }
}
