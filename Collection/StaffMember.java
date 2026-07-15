public class StaffMember {

    int empNo;
    String name;
    int age;
    String location;

    public StaffMember(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee No: " + empNo +
               ", Name: " + name +
               ", Age: " + age +
               ", Location: " + location;
    }
}