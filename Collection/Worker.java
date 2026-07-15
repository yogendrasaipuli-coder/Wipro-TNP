public class Worker {

    int empId;
    String empName;
    double salary;

    public Worker(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + empId +
               ", Name : " + empName +
               ", Salary : " + salary;
    }
}