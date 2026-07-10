import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartment = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartment.length; i++) {

            int choice = random.nextInt(4) + 1;

            switch (choice) {

                case 1:
                    compartment[i] = new FirstClass();
                    break;

                case 2:
                    compartment[i] = new Ladies();
                    break;

                case 3:
                    compartment[i] = new General();
                    break;

                case 4:
                    compartment[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Railway Compartments:");

        for (Compartment c : compartment) {
            System.out.println(c.notice());
        }
    }
}