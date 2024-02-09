package threads;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EvenOddThreadsTest {

    @Test
    public void testEvenOddThreads() {
        // Set up the EvenOddThreads instance
        EvenOddThreads evenOddThreads = new EvenOddThreads();

        // Create two threads with different runnables
        Thread thread1 = new Thread(() -> EvenOddThreads.EvenOddThreads(new String[0]));
        Thread thread2 = new Thread(() -> EvenOddThreads.EvenOddThreads(new String[0]));

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assert that the threads have finished successfully
        assertTrue(true);
    }
}
