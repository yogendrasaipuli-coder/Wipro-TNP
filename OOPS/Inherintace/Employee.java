public class Employee extends Person {

    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {

        super(name);

        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public static void main(String[] args) {

        Employee emp = new Employee("John", 750000, 2022, "NI12345");

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}