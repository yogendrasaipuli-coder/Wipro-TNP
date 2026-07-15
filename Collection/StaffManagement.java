public class StaffManagement {

    public static void main(String[] args) {

        StaffDB db = new StaffDB();

        Staff s1 = new Staff(101, "Ravi", "ravi@gmail.com", "Male", 35000);
        Staff s2 = new Staff(102, "Priya", "priya@gmail.com", "Female", 42000);
        Staff s3 = new Staff(103, "Kiran", "kiran@gmail.com", "Male", 50000);

        db.addEmployee(s1);
        db.addEmployee(s2);
        db.addEmployee(s3);

        System.out.println("Employee Details");
        db.displayEmployees();

        System.out.println(db.showPaySlip(102));

        System.out.println("\nDeleting Employee 101...");
        db.deleteEmployee(101);

        System.out.println("\nRemaining Employees");
        db.displayEmployees();
    }
}