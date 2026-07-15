import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<EmployeeInfo> employees = new ArrayList<>();

        employees.add(new EmployeeInfo(101, "Ravi", 8000));
        employees.add(new EmployeeInfo(102, "Priya", 15000));
        employees.add(new EmployeeInfo(103, "Kiran", 9500));
        employees.add(new EmployeeInfo(104, "Anjali", 12000));
        employees.add(new EmployeeInfo(105, "Rahul", 7000));

        Predicate<EmployeeInfo> lowSalary = e -> e.getSalary() < 10000;

        System.out.println("Employees with Salary less than 10000:");

        employees.stream()
                 .filter(lowSalary)
                 .forEach(e -> System.out.println(e.getName()));
    }
}