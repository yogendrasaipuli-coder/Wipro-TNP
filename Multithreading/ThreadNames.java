class MyThread extends Thread {
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName());
    }
}

public class ThreadNames {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Assign names to the threads
        t1.setName("Scooby");
        t2.setName("Shaggy");

        // Display thread names
        System.out.println("Thread 1 Name: " + t1.getName());
        System.out.println("Thread 2 Name: " + t2.getName());

        // Start the threads
        t1.start();
        t2.start();
    }
}