package WrapperClasses;
class EmployeeData implements Cloneable {

    private int empId;
    private String empName;
    private double salary;

    public EmployeeData(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public EmployeeData clone() throws CloneNotSupportedException {
        return (EmployeeData) super.clone();
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeClone {

    public static void main(String[] args) {

        try {

            EmployeeData emp1 = new EmployeeData(101, "John", 50000);

            EmployeeData emp2 = emp1.clone();

            // Modify original object
            emp1.setEmpId(102);
            emp1.setEmpName("David");
            emp1.setSalary(60000);

            System.out.println("Original Employee");
            emp1.display();

            System.out.println();

            System.out.println("Cloned Employee");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}