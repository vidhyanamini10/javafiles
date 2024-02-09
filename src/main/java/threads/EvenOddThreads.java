package threads;

public class EvenOddThreads {
    public static void EvenOddThreads(String[] args) {
        Runnable myRunnable = () -> {
            for (int i = 0; i <= 60; i = i+2) {
                System.out.println(i);
            }

        };
        Runnable myRunnable2 = () -> {
            for (int i = 1; i <= 60; i = i+2) {
                System.out.println(i);
            }

        };
        Thread thread = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable2);

        thread.setDaemon(true);
        thread.start();
        thread2.start();
        try {

            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
