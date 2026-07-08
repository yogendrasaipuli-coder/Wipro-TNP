public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee("John", 750000, 2022, "NI12345");

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}