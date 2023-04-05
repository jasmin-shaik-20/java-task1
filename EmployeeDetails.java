class EmployeeDetails {
     int empid;
     String name;
     int age;
     double salary;







    public EmployeeDetails(int empid, String name, int age, double salary) {
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.salary = salary;


    }



    public int  getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "EmployeeDetails{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }




}
