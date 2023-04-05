import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer, PermanentEmployee> permanentEmployeeHashtable = new Hashtable<>();
        Hashtable<Integer, PartTimeEmployee> partTimeEmployeeHashtable = new Hashtable<>();
        Hashtable<Integer, ContractEmployee> contractEmployeeHashtable = new Hashtable<>();
        boolean bool = true;

        while (bool) {
            System.out.println("\n\n------ Employee Management System ------\n");
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. List all employees");
            System.out.println("4. Search employee");
            System.out.println("5. Modify employee");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n------ Add employee ------\n");
                    System.out.print("Enter employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter employee type (1-Permanent, 2-PartTime, 3-Contract): ");
                    int empType = scanner.nextInt();

                    if (empType == 1) {
                        System.out.print("Enter employee bonus: ");
                        double bonus = scanner.nextDouble();
                        PermanentEmployee permanentEmployee = new PermanentEmployee(empId, name, age, salary, bonus);
                        permanentEmployeeHashtable.put(empId, permanentEmployee);


                    } else if (empType == 2) {
                        System.out.print("Enter employee hours worked: ");
                        int hoursWorked = scanner.nextInt();

                        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empId, name, age, salary, hoursWorked);
                        partTimeEmployeeHashtable.put(empId, partTimeEmployee);

                    } else if (empType == 3) {
                        System.out.print("Enter employee contract duration: ");
                        int contractDuration = scanner.nextInt();
                        ContractEmployee contractEmployee = new ContractEmployee(empId, name, age, salary, contractDuration);
                        contractEmployeeHashtable.put(empId, contractEmployee);

                    } else {
                        System.out.println("Invalid employee type.");
                    }
                    break;
                case 2:
                    System.out.println("\n------ Remove employee ------\n");
                    System.out.print("Enter employee type (1-Permanent, 2-PartTime, 3-Contract): ");
                    int empTypeRemove = scanner.nextInt();
                    if (empTypeRemove == 1) {
                        System.out.print("Enter employee ID: ");
                        int empId1 = scanner.nextInt();
                        if (permanentEmployeeHashtable.containsKey(empId1)) {
                            permanentEmployeeHashtable.remove(empId1);
                            System.out.println("Employee remove successfully");
                        } else {
                            System.out.println("Employee id not found");
                        }


                    } else if (empTypeRemove == 2) {
                        System.out.print("Enter employee ID: ");
                        int empId1 = scanner.nextInt();
                        if (partTimeEmployeeHashtable.containsKey(empId1)) {
                            partTimeEmployeeHashtable.remove(empId1);
                            System.out.println("Employee remove successfully");
                        } else {
                            System.out.println("Employee id not found");
                        }


                    } else if (empTypeRemove == 3) {
                        System.out.print("Enter employee ID: ");
                        int empId1 = scanner.nextInt();
                        if (contractEmployeeHashtable.containsKey(empId1)) {
                            contractEmployeeHashtable.remove(empId1);
                            System.out.println("Employee remove successfully");
                        } else {
                            System.out.println("Employee id not found");
                        }

                    }
                    break;

                case 3:
                    System.out.println("\n------ List of employees------\n");
                    System.out.print("Enter employee type (1-Permanent, 2-PartTime, 3-Contract, 4.All types of employees): ");
                    int emplist = scanner.nextInt();
                    if (emplist == 1) {
                        if (permanentEmployeeHashtable.isEmpty()) {
                            System.out.println("Employee not found");
                        } else {
                            System.out.println(permanentEmployeeHashtable);
                        }
                    } else if (emplist == 2) {
                        if (partTimeEmployeeHashtable.isEmpty()) {
                            System.out.println("Employee not found");
                        } else {
                            System.out.println(partTimeEmployeeHashtable);
                        }
                    } else if (emplist == 3) {
                        if (contractEmployeeHashtable.isEmpty()) {
                            System.out.println("Employee not found");
                        } else {
                            System.out.println(contractEmployeeHashtable);
                        }
                    }
                    else if(emplist==4){
                        System.out.println(permanentEmployeeHashtable);
                        System.out.println(partTimeEmployeeHashtable);
                        System.out.println(contractEmployeeHashtable);
                    }
                    break;

                case 4:
                    System.out.println("\n------Search employee--------\n");
                    System.out.print("Enter employee type (1-Permanent, 2-PartTime, 3-Contract): ");
                    int empsearch = scanner.nextInt();
                    if (empsearch == 1) {
                        System.out.println("Enter empid: ");
                        int empid = scanner.nextInt();
                        if (permanentEmployeeHashtable.containsKey(empid)) {
                            System.out.println(permanentEmployeeHashtable.get(empid));
                        } else {
                            System.out.println("Employee not found");
                        }
                    } else if (empsearch == 2) {
                        System.out.println("Enter empid: ");
                        int empid = scanner.nextInt();
                        if (partTimeEmployeeHashtable.containsKey(empid)) {
                            System.out.println(partTimeEmployeeHashtable.get(empid));
                        } else {
                            System.out.println("Employee id not found");
                        }

                    } else if (empsearch == 3) {
                        System.out.println("Enter empid: ");
                        int empid = scanner.nextInt();
                        if (contractEmployeeHashtable.containsKey(empid)) {
                            System.out.println(partTimeEmployeeHashtable.get(empid));
                        } else {
                            System.out.println("Employee id not found");
                        }

                    }
                    break;

                case 5:
                    System.out.println("\n------Modify Employee--------\n");
                    System.out.print("Enter employee type (1-Permanent, 2-PartTime, 3-Contract): ");
                    int empmod = scanner.nextInt();
                    if (empmod == 1) {
                        System.out.println("Enter empid: ");
                        int empp = scanner.nextInt();
                        if (permanentEmployeeHashtable.containsKey(empp)) {
                            System.out.println("Enter which credintials you want to edit: ");
                            System.out.println("1.name 2.age 3.salary 4.bonus");
                            int select = scanner.nextInt();


                            if (select == 1) {
                                for (Map.Entry<Integer, PermanentEmployee> e : permanentEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter name to modify:");
                                        scanner.nextLine();
                                        String mname = scanner.nextLine();
                                        int empid = e.getValue().getEmpid();
                                        int agem = e.getValue().getAge();
                                        double salarym = e.getValue().getSalary();
                                        double bonus = e.getValue().getBonus();
                                        PermanentEmployee permanentEmployee = new PermanentEmployee(empid, mname, agem, salarym, bonus);
                                        permanentEmployeeHashtable.put(empid, permanentEmployee);
                                        System.out.println("Name modified Successfully");
                                    }
                                }
                            } else if (select == 2) {
                                for (Map.Entry<Integer, PermanentEmployee> e : permanentEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter age to modify:");
                                        int agem = scanner.nextInt();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        double bonus = e.getValue().getBonus();
                                        PermanentEmployee permanentEmployee = new PermanentEmployee(empid, mname, agem, salarym, bonus);
                                        permanentEmployeeHashtable.put(empid, permanentEmployee);
                                        System.out.println("Age modified Successfully");
                                    }
                                }

                            } else if (select == 3) {
                                for (Map.Entry<Integer, PermanentEmployee> e : permanentEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter salary to modify:");
                                        double salarym = scanner.nextDouble();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        int agem = e.getValue().getAge();
                                        double bonus = e.getValue().getBonus();
                                        PermanentEmployee permanentEmployee = new PermanentEmployee(empid, mname, agem, salarym, bonus);
                                        permanentEmployeeHashtable.put(empid, permanentEmployee);
                                        System.out.println("Salary modified Successfully");
                                    }
                                }
                            } else if (select == 4) {
                                for (Map.Entry<Integer, PermanentEmployee> e : permanentEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter bonus to modify:");
                                        double bonus = scanner.nextDouble();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        int agem = e.getValue().getAge();
                                        double salarym = e.getValue().getSalary();
                                        PermanentEmployee permanentEmployee = new PermanentEmployee(empid, mname, agem, salarym, bonus);
                                        permanentEmployeeHashtable.put(empid, permanentEmployee);
                                        System.out.println("Bonus modified Successfully");
                                    }
                                }
//
                            }
                        }
                        else {
                            System.out.println("Employee id not found");
                        }

//
                    } else if (empmod == 2) {
                        System.out.println("Enter empid: ");
                        int empp = scanner.nextInt();
                        if (partTimeEmployeeHashtable.containsKey(empp)) {
                            System.out.println("Enter which credintials you want to edit: ");
                            System.out.println("1.name 2.age 3.salary 4.HoursWorked");
                            int select = scanner.nextInt();
                            if (select == 1) {
                                for (Map.Entry<Integer, PartTimeEmployee> e : partTimeEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter name to modify:");
                                        scanner.nextLine();
                                        String mname = scanner.nextLine();
                                        int empid = e.getValue().getEmpid();
                                        int agem = e.getValue().getAge();
                                        double salarym = e.getValue().getSalary();
                                        int hoursm = e.getValue().getHoursWorked();
                                        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empid, mname, agem, salarym, hoursm);
                                        partTimeEmployeeHashtable.put(empid, partTimeEmployee);
                                        System.out.println("Name modified Successfully");
                                    }
                                }
                            } else if (select == 2) {
                                for (Map.Entry<Integer, PartTimeEmployee> e : partTimeEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter age to modify:");
                                        int agem = scanner.nextInt();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        int hoursm = e.getValue().getHoursWorked();
                                        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empid, mname, agem, salarym, hoursm);
                                        partTimeEmployeeHashtable.put(empid, partTimeEmployee);
                                        System.out.println("Age modified Successfully");
                                    }
                                }
                            } else if (select == 3) {
                                for (Map.Entry<Integer, PartTimeEmployee> e : partTimeEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter salary to modify:");
                                        double salarym = scanner.nextDouble();
                                        int agem = e.getValue().getAge();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        int hoursm = e.getValue().getHoursWorked();
                                        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empid, mname, agem, salarym, hoursm);
                                        partTimeEmployeeHashtable.put(empid, partTimeEmployee);
                                        System.out.println("Salary modified Successfully");
                                    }
                                }
                            } else if (select == 4) {
                                for (Map.Entry<Integer, PartTimeEmployee> e : partTimeEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter hours time to modify:");
                                        int hoursm = scanner.nextInt();
                                        int agem = e.getValue().getAge();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empid, mname, agem, salarym, hoursm);
                                        partTimeEmployeeHashtable.put(empid, partTimeEmployee);
                                        System.out.println("Hours time modified Successfully");
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Employee id not found");
                        }
                    } else if (empmod == 3) {
                        System.out.println("Enter empid: ");
                        int empp = scanner.nextInt();

                        if (contractEmployeeHashtable.containsKey(empp)) {
                            System.out.println("Enter which credintials you want to edit: ");
                            System.out.println("1.name 2.age 3.salary 4.DurationTime");
                            int select = scanner.nextInt();
                            if (select == 1) {
                                for (Map.Entry<Integer, ContractEmployee> e : contractEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter name to modify:");
                                        String mname = scanner.nextLine();
                                        int agem = e.getValue().getAge();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        int durm = e.getValue().getContractDuration();
                                        ContractEmployee contractEmployee = new ContractEmployee(empid, mname, agem, salarym, durm);
                                        contractEmployeeHashtable.put(empid, contractEmployee);
                                        System.out.println("Name modified Successfully");
                                    }
                                }
                            } else if (select == 2) {
                                for (Map.Entry<Integer, ContractEmployee> e : contractEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter age to modify:");
                                        int agem = scanner.nextInt();
                                        ;
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        int durm = e.getValue().getContractDuration();
                                        ContractEmployee contractEmployee = new ContractEmployee(empid, mname, agem, salarym, durm);
                                        contractEmployeeHashtable.put(empid, contractEmployee);
                                        System.out.println("Age modified Successfully");

                                    }
                                }
                            }
                                else if (select == 3) {
                                for (Map.Entry<Integer, ContractEmployee> e : contractEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter salary to modify:");
                                        double salarym = scanner.nextDouble();
                                        int agem = e.getValue().getAge();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        int durm = e.getValue().getContractDuration();
                                        ContractEmployee contractEmployee = new ContractEmployee(empid, mname, agem, salarym, durm);
                                        contractEmployeeHashtable.put(empid, contractEmployee);
                                        System.out.println("Salary modified Successfully");

                                    }
                                }
                            } else if (select == 4) {
                                for (Map.Entry<Integer, ContractEmployee> e : contractEmployeeHashtable.entrySet()) {
                                    if (e.getKey() == empp) {


                                        System.out.println("Enter duration time to modify:");
                                        int durm = scanner.nextInt();
                                        int agem = e.getValue().getAge();
                                        String mname = e.getValue().getName();
                                        int empid = e.getValue().getEmpid();
                                        double salarym = e.getValue().getSalary();
                                        ContractEmployee contractEmployee = new ContractEmployee(empid, mname, agem, salarym, durm);
                                        contractEmployeeHashtable.put(empid, contractEmployee);
                                        System.out.println("Duration time modified Successfully");

                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Employee id not found");
                        }
                    }
                    break;
            }
            System.out.println("Enter true if you want to continue: ");
            bool = scanner.nextBoolean();




    }
}
            }

