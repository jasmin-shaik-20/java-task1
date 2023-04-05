public class PartTimeEmployee extends EmployeeDetails{

    private int hoursWorked;

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hourlyWorked=" + hoursWorked +
                '}';
    }

    private double hourlyRate;

    public PartTimeEmployee(int empid, String name, int age, double salary, int hoursWorked) {
        super(empid, name, age, salary);
        this.hoursWorked = hoursWorked;

    }


    public int getHoursWorked() {
        return hoursWorked;
    }




}
