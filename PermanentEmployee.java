class PermanentEmployee extends EmployeeDetails{
    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +

                ", bonus=" + bonus +
                '}';
    }

    private double bonus;
    public PermanentEmployee(int empid, String name, int age, double salary, double bonus) {
        super(empid, name, age, salary);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }
}
