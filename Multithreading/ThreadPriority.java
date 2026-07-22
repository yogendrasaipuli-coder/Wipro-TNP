class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("MAX Priority Thread");
        CustomThread t2 = new CustomThread("MIN Priority Thread");
        CustomThread t3 = new CustomThread("NORM Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}