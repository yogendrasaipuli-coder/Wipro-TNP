import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static final String FILE_NAME = "employee.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();

                EmployeeRecords emp = new EmployeeRecords(id, name, age, salary);

                try {

                    FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
                    ObjectOutputStream oos;

                    if (new File(FILE_NAME).length() == 0) {
                        oos = new ObjectOutputStream(fos);
                    } else {
                        oos = new AppendableObjectOutputStream(fos);
                    }

                    oos.writeObject(emp);
                    oos.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;

            case 2:

                System.out.println("-----Report-----");

                try {

                    File file = new File(FILE_NAME);

                    if (!file.exists() || file.length() == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {

                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

                        while (true) {
                            try {
                                EmployeeRecords e = (EmployeeRecords) ois.readObject();
                                System.out.println(e);
                            } catch (EOFException ex) {
                                break;
                            }
                        }

                        ois.close();
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("-----End of Report-----");

                break;

            case 3:

                System.out.println("Exiting the System");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}