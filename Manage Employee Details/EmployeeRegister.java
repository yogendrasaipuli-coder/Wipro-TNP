import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<EmployeeDetails> employeeList =
                new TreeSet<>(new Comparator<EmployeeDetails>() {

            @Override
            public int compare(EmployeeDetails e1, EmployeeDetails e2) {

                int result = e1.getFirstName()
                               .compareToIgnoreCase(e2.getFirstName());

                if (result == 0) {
                    result = e1.getLastName()
                               .compareToIgnoreCase(e2.getLastName());
                }

                return result;
            }
        });

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employeeList.add(new EmployeeDetails(firstName, lastName,
                    mobile, email, address));
        }

        System.out.println("\nEmployee List");

        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (EmployeeDetails e : employeeList) {

            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}