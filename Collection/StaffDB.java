import java.util.ArrayList;

public class StaffDB {

    ArrayList<Staff> list = new ArrayList<>();

    public boolean addEmployee(Staff e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Staff e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Staff e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nEmployee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    public void displayEmployees() {
        if (list.isEmpty()) {
            System.out.println("No Employees Available.");
        } else {
            for (Staff e : list) {
                e.getEmployeeDetails();
            }
        }
    }
}