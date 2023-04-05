public class ContractEmployee extends EmployeeDetails{


    @Override
    public String toString() {
        return "ContractEmployee{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", Duration=" + contractDuration +
                '}';
    }

    private int contractDuration;
    public ContractEmployee(int empid, String name, int age, double salary,int contractDuration) {
        super(empid, name, age, salary);

        this.contractDuration = contractDuration;
    }



    public int getContractDuration()
    {
        return contractDuration;
    }


}
