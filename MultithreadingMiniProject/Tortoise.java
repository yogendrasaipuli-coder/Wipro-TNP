public class Tortoise extends Thread {

    public Tortoise() {
        super("Tortoise");
    }

    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (Hare.raceOver)
                break;

            System.out.println(getName() + " ran " + i + " meters");

            if (i == 100) {
                Hare.raceOver = true;
                System.out.println(getName() + " wins the race!");
            }
        }
    }
}