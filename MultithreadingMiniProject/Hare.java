public class Hare extends Thread {

    public static boolean raceOver = false;

    public Hare() {
        super("Hare");
    }

    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (raceOver)
                break;

            System.out.println(getName() + " ran " + i + " meters");

            if (i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 100) {
                raceOver = true;
                System.out.println(getName() + " wins the race!");
            }
        }
    }
}