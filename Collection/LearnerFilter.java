import java.util.ArrayList;

public class LearnerFilter {

    public static void main(String[] args) {

        ArrayList<Learner> list = new ArrayList<Learner>();

        list.add(new Learner(1, "Ravi", 65));
        list.add(new Learner(2, "Priya", 45));
        list.add(new Learner(3, "Kiran", 80));
        list.add(new Learner(4, "Anjali", 50));
        list.add(new Learner(5, "Rahul", 35));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Number of Students Cleared: " + count);
    }
}